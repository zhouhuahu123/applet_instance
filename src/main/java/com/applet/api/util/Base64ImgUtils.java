package com.applet.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;
import java.io.*;
/**
 * base64图片处理
 * @author zhouhuahu
 */
public class Base64ImgUtils {
    private static final Logger logger = LoggerFactory.getLogger(Base64ImgUtils.class);

    public static void main(String[] args) {
        String strImg = GetImageStr();
        System.out.println(strImg);
        try {
            GenerateImage(strImg, "dsf");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片转化成base64字符串
     * GetImageStr
     * 2016年8月31日下午3:37:40
     *
     * @param
     * @return
     */
    public static String GetImageStr() {// 将图片文件转化为字节数组字符串，并对其进行Base64编码处理
        String imgFile = "C:\\Users\\zhuhaiqiang\\Documents\\美图图库\\示例图片_03.jpg";// 待处理的图片
        InputStream in = null;
        byte[] data = null;
        // 读取图片字节数组
        try {
            in = new FileInputStream(imgFile);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        String imghead = "data:image/jpg;base64,";//头
        return encoder.encode(data);
    }

    public static boolean GenerateImage(String imgStr, String fileName) {
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            // Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for (int i = 0; i < b.length; ++i) {
                if (b[i] < 0) {// 调整异常数据
                    b[i] += 256;
                }
            }
            // 生成jpeg图片
            OutputStream out = new FileOutputStream(fileName);
            out.write(b);
            out.flush();
            out.close();
//            return fileName.substring(fileName.lastIndexOf("api") - 1);
            return true;
        } catch (Exception e) {
            logger.error("报单上传图片至Temp目录出错：", e);
            return false;
        }
    }
}
