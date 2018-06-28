package com.applet.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by zhouhuahu on 2017/5/19.
 */
public class FilesUtil {
    private static final Logger logger = LoggerFactory.getLogger(FilesUtil.class);

    /**
     * 复制文件或文件夹
     * @param pathname 目标文件夹路径
     * @param topathname 复制到的路径
     * @return
     */
    public static String copyFiles(String pathname, String topathname) {
        //需要复制的目标文件或目标文件夹
        File file = new File(pathname);
        //复制到的位置
        File toFile = new File(topathname);
        try {
            copy(file, toFile);
            return null;
        } catch (Exception e) {
            logger.error("复制文件出错：", e);
            return "复制文件出错";
        }
    }

    /**
     * 复制文件内容
     * @param file
     * @param toFile
     * @throws Exception
     */
    public static void copy(File file, File toFile) throws Exception {
        byte[] b = new byte[1024];
        int a;
        FileInputStream fis;
        FileOutputStream fos;
        if (file.isDirectory()) {
            //String toFilepath = toFile.getAbsolutePath();
            System.out.println("草稿文件夹路径：" + toFile.getName());
            //File copy=new File(toFilepath);
            //复制文件夹
            if (!toFile.exists()) {
                toFile.mkdir();
            }
            if (toFile.exists()) {
                System.out.println("草稿文件夹创建成功");
            }else {
                System.out.println("草稿文件夹创建失败");
            }
            //遍历文件夹
            for (File f : file.listFiles()) {
                copy(f, toFile);
            }
        } else {
            if (toFile.isDirectory()) {
                String filepath = file.getAbsolutePath();
                filepath=filepath.replaceAll("\\\\", "/");
                String toFilepath = toFile.getAbsolutePath();
                toFilepath=toFilepath.replaceAll("\\\\", "/");
                int lastIndexOf = filepath.lastIndexOf("/");
                toFilepath = toFilepath + filepath.substring(lastIndexOf ,filepath.length());
                //写文件
                File newFile = new File(toFilepath);
                fis = new FileInputStream(file);
                fos = new FileOutputStream(newFile);
                while ((a = fis.read(b)) != -1) {
                    fos.write(b, 0, a);
                }
                fis.close();
                fos.close();
            } else {
                //写文件
                fis = new FileInputStream(file);
                fos = new FileOutputStream(toFile);
                while ((a = fis.read(b)) != -1) {
                    fos.write(b, 0, a);
                }
                fis.close();
                fos.close();
            }
        }
    }

    /**
     * 删除指定文件夹下所有文件
     * @param path 文件夹完整绝对路径
     * @return
     */
    public static boolean delAllFile(String path) {
        boolean flag = false;
        File file = new File(path);
        if (!file.exists()) {
            return flag;
        }
        if (!file.isDirectory()) {
            return flag;
        }
        String[] tempList = file.list();
        File temp = null;
        for (int i = 0; i < tempList.length; i++) {
            if (path.endsWith(File.separator)) {
                temp = new File(path + tempList[i]);
            } else {
                temp = new File(path + File.separator + tempList[i]);
            }
            if (temp.isFile()) {
                temp.delete();
            }
            if (temp.isDirectory()) {
                delAllFile(path + "/" + tempList[i]);//先删除文件夹里面的文件
                delFolder(path + "/" + tempList[i]);//再删除空文件夹
                flag = true;
            }
        }
        return flag;
    }

    /**
     * 删除指定文件夹
     * @param realPath
     * @return
     */
    public static String deleteFiles(String realPath) {
        try {
            File file = new File(realPath);
            if (file.exists()) {
                logger.info("清除指定文件夹:" + realPath);
                delFolder(realPath);
            }
            return null;
        } catch (Exception e) {
            return "操作失败";
        }
    }

    /**
     * 删除文件夹
     * @param folderPath 文件夹完整绝对路径
     */
    public static void delFolder(String folderPath) {
        try {
            delAllFile(folderPath); //删除完里面所有内容
            String filePath = folderPath;
            filePath = filePath.toString();
            File myFilePath = new File(filePath);
            myFilePath.delete(); //删除空文件夹
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
