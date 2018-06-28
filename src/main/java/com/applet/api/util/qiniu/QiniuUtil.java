package com.applet.api.util.qiniu;

import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.processing.OperationManager;
import com.qiniu.processing.OperationStatus;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.util.Auth;
import com.qiniu.util.UrlSafeBase64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Iterator;
import java.util.Map;

/**
 * Created by zhouhuahu on 2017/7/21.
 */
public class QiniuUtil {

    private static final Logger logger = LoggerFactory.getLogger(QiniuUtil.class);

    private static BucketManager bucketManager;

    private static Auth auth;

    private static OperationManager operationManager;

    private static UploadManager uploadManager;

    private static String zipSuffix = "YS.jpg";

    static {
        Configuration cfg = new Configuration();
        auth = Auth.create(Config.AK, Config.SK);
        bucketManager = new BucketManager(auth, cfg);
        operationManager = new OperationManager(auth, cfg);
        uploadManager = new UploadManager(cfg);
    }


    public static String getUploadTokenPublic() {
        return auth.uploadToken(Config.bucketAppletPublic);
    }

    public static String getUploadTokenPrivate(String key) {
        return auth.uploadToken(Config.bucketAppletPrivate, key, 120L, null);
    }


    public static boolean existsFile(String bucket, String key) {
        try {
            FileInfo info = bucketManager.stat(bucket, key);
            return null != info;
        } catch (QiniuException e) {
            return false;
        }
    }

    public static boolean existsZipFile(String bucket, String key) {
        try {
            FileInfo info = bucketManager.stat(bucket, key + zipSuffix);
            return null != info;
        } catch (QiniuException e) {
            return false;
        }
    }


    /**
     * java 内上传文件
     *
     * @param file
     * @param fileName
     */
    public static void uploadFile(byte[] file, String fileName, String securityType) {
        try {
            Response response = uploadManager.put(file, fileName, auth.uploadToken(securityType, fileName, 600, null));
            logger.info("java sdk 上传文件：" + response.bodyString());
        } catch (Exception e) {
            logger.error("上传Audit文件出错", e);
        }
    }


    /**
     * 压缩七牛文件
     */
    public static int zipLklFiles(String zipKey, Map<String, String> zipFiles) {

        deleteFile(Config.bucketAppletPrivate, zipKey);

        String key = "upload/shopPic/100/0.jpg";
        String pfops = "mkzip/2";
        Iterator iter = zipFiles.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            String beforeKey = UrlSafeBase64.encodeToString(entry.getKey().toString());
            String afterKey = UrlSafeBase64.encodeToString(entry.getValue().toString());
            pfops += "/url/" + beforeKey + "/alias/" + afterKey;
        }
        pfops += "|saveas/" + UrlSafeBase64.encodeToString(Config.bucketAppletPrivate + ":" + zipKey);
        try {
            String persistentId = operationManager.pfop(Config.bucketAppletPrivate, key, pfops, null);
            logger.info("处理ID；" + persistentId);
            OperationStatus status = operationManager.prefop(persistentId);
            return status.code;
        } catch (QiniuException e) {
            logger.error("zip压缩上传七牛出错", e);
            return -1;
        }

    }

    /**
     * 生成下载凭证 60s
     *
     * @param requestURI
     * @return
     */
    public static String generateQiniuPrivateDownURL(String requestURI, Long expires) {
        Auth auth = Auth.create(Config.AK, Config.SK);
        String downloadRUL = auth.privateDownloadUrl(Config.downURLAppletPrivateUrl + requestURI, (null == expires) ? 60 : expires);
        return downloadRUL;
    }


    public static String generateQiniuPrivateDownURL(String requestURI) {
        return generateQiniuPrivateDownURL(requestURI, null);
    }

    public static String generateQiniuPublicDownURL(String requestURI) {
        String downloadRUL = Config.downURLAppletPublicUrL + requestURI;
        return downloadRUL;
    }


    /**
     * 重命名七牛文件
     *
     * @param bucket
     * @param oldKey
     * @param newKey
     * @param delete
     */
    public static void renameFile(String bucket, String oldKey, String newKey, boolean delete) {
        try {
            if (delete) {
                deleteFile(bucket, newKey);
            }
            bucketManager.rename(bucket, oldKey, newKey);
            logger.info("七牛云重命名文件成功 old:{},new:{}", oldKey, newKey);
        } catch (QiniuException e) {
            logger.info("七牛云重命名文件出错{}", e.getMessage());
        }
    }

    public static boolean renameFile(String bucket, String oldKey, String newKey) {
        try {
            bucketManager.rename(bucket, oldKey, newKey);
            logger.info("七牛云重命名文件成功 old:{},new:{}", oldKey, newKey);
            return true;
        } catch (QiniuException e) {
            logger.info("七牛云重命名文件出错{}", e.getMessage());
            return false;
        }
    }

    /**
     * 删除七牛文件
     *
     * @param bucket
     * @param key
     */
    public static void deleteFile(String bucket, String key) {
        try {
            if (existsFile(bucket, key)) {
                bucketManager.delete(bucket, key);
                logger.info("七牛云删除文件成功{}", key);
            } else {
                logger.info("七牛云删除文件时发现文件不存在{}", key);
            }
        } catch (QiniuException e) {
            logger.info("七牛云删除文件出错{}", e.getMessage());
        }
    }



    /**
     * 七牛 key
     *
     * @param picKey
     * @return
     */
    public static String generateQiniuPrivateDownURLByQuality(String picKey) {
        String qualityKey = picKey.replaceAll(".jpg", zipSuffix);
        if (existsFile(Config.bucketAppletPrivate, qualityKey)) {
            return generateQiniuPrivateDownURL(qualityKey, 300l);
        }
        return null;
    }

    public static void main(String[] args) {
        try {
            String key = "upload/20180614091442256512/cbada7d8e2704fc1acae57a861889af5.jpg";
//            if (existsFile(Config.bucketAppletPrivate, key)){
//                System.out.println("七牛云图片路径：" + QiniuUtil.generateQiniuPrivateDownURLByQuality(key));
//            } else {
//                System.out.println("未找到文件");
//            }
            System.out.println("七牛云图片路径：" + QiniuUtil.generateQiniuPrivateDownURL(key));
//            deleteFile(Config.bucketAppletPrivate, key);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
