package com.applet.api.util;

import org.im4java.core.*;
import org.im4java.process.ArrayListOutputConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author zhouhuahu
 */
public class ImagesUtil {

    private static final Logger logger = LoggerFactory.getLogger(ImagesUtil.class);

    public static long MAX_IMG_LENGTH = 1331200;   //1.3M


    private static ConvertCmd getCmd() {
        ConvertCmd convert = new ConvertCmd();
        String sysOs = System.getProperties().getProperty("os.name");
        if (sysOs.indexOf("Windows") > 0) {
            convert.setSearchPath("D:\\Develop\\ImageMagick-7.0.6-Q16");
        }
        return convert;
    }

    /**
     * 根据坐标裁剪图片
     *
     * @param srcPath 要裁剪图片的路径
     * @param newPath 裁剪图片后的路径
     * @param x       起始横坐标
     * @param y       起始纵坐标
     * @param x1      结束横坐标
     * @param y1      结束纵坐标
     */
    public static void cutImage(String srcPath, String newPath, int x, int y, int x1,
                                int y1) throws Exception {
        int width = x1 - x;
        int height = y1 - y;
        IMOperation op = new IMOperation();
        op.addImage(srcPath);
        /**  width：裁剪的宽度    * height：裁剪的高度 * x：裁剪的横坐标 * y：裁剪纵坐标  */
        op.crop(width, height, x, y);
        op.addImage(newPath);
        getCmd().run(op);
    }

    /**
     * 根据尺寸缩放图片
     *
     * @param width   缩放后的图片宽度
     * @param height  缩放后的图片高度
     * @param srcPath 源图片路径
     * @param newPath 缩放后图片的路径
     */
    public static void zoomImage(Integer width, Integer height, String srcPath, String newPath) throws Exception {
        IMOperation op = new IMOperation();
        op.addImage(srcPath);
        if (width == null) {//根据高度缩放图片
            op.resize(null, height);
        } else if (height == null) {//根据宽度缩放图片
            op.resize(width, null);
        } else {
            op.resize(width, height);
        }
        op.addImage(newPath);
        getCmd().run(op);
    }


    /**
     * 给图片加水印
     *
     * @param srcPath 源图片路径
     */
    public static void addImgText(String srcPath, String content) throws Exception {
        IMOperation op = new IMOperation();
        op.font("微软雅黑");
        op.gravity("southeast");
        op.pointsize(18).fill("#BCBFC8").draw("text 0,0 " + content);   //("x1 x2 x3 x4") x1 格式，x2 x轴距离 x3 y轴距离  x4名称
        op.addImage();
        op.addImage();
        try {
            getCmd().run(op, srcPath, srcPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片水印
     *
     * @param srcImagePath   源图片
     * @param waterImagePath 水印
     * @param destImagePath  生成图片
     * @param gravity        图片位置
     * @param dissolve       水印透明度
     */
    public static void waterMark(String waterImagePath, String srcImagePath, String destImagePath, String gravity, int dissolve) {
        IMOperation op = new IMOperation();
        op.gravity(gravity);
        op.dissolve(dissolve);
        op.addImage(waterImagePath);
        op.addImage(srcImagePath);
        op.addImage(destImagePath);
        CompositeCmd cmd = new CompositeCmd();
        try {
            cmd.run(op);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IM4JavaException e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片旋转
     *
     * @param srcImagePath
     * @param destImagePath
     * @param angle
     */
    public static void rotate(String srcImagePath, String destImagePath, double angle) {
        try {
            IMOperation op = new IMOperation();
            op.rotate(angle);
            op.addImage(srcImagePath);
            op.addImage(destImagePath);
            ConvertCmd cmd = new ConvertCmd();
            cmd.run(op);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 图片信息
     *
     * @param imagePath
     * @return
     */
    public static String showImageInfo(String imagePath) {
        String line = null;
        try {
            IMOperation op = new IMOperation();
            op.format("width:%w,height:%h,path:%d%f,size:%b%[EXIF:DateTimeOriginal]");
            op.addImage(1);
            IdentifyCmd identifyCmd = new IdentifyCmd(true);
            ArrayListOutputConsumer output = new ArrayListOutputConsumer();
            identifyCmd.setOutputConsumer(output);
            identifyCmd.run(op, imagePath);
            ArrayList<String> cmdOutput = output.getOutput();
            assert cmdOutput.size() == 1;
            line = cmdOutput.get(0);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    /**
     * 图片合成
     *
     * @param args
     * @param maxWidth
     * @param maxHeight
     * @param newpath
     * @param mrg
     * @param type      1:横,2:竖
     */
    public static void montage(String[] args, Integer maxWidth, Integer maxHeight, String newpath, Integer mrg, String type) {
        IMOperation op = new IMOperation();
        ConvertCmd cmd = new ConvertCmd();
        String thumb_size = maxWidth + "x" + maxHeight + "^";
        String extent = maxWidth + "x" + maxHeight;
        if ("1".equals(type)) {
            op.addRawArgs("+append");
        } else if ("2".equals(type)) {
            op.addRawArgs("-append");
        }

        op.addRawArgs("-thumbnail", thumb_size);
        op.addRawArgs("-gravity", "center");
        op.addRawArgs("-extent", extent);

        Integer border_w = maxWidth / 40;
        op.addRawArgs("-border", border_w + "x" + border_w);
        op.addRawArgs("-bordercolor", "#ccc");

        op.addRawArgs("-border", 1 + "x" + 1);
        op.addRawArgs("-bordercolor", "#fff");

        for (String img : args) {
            op.addImage(img);
        }
        if ("1".equals(type)) {
            Integer whole_width = ((mrg / 2) + 1 + border_w + maxWidth + border_w + (mrg / 2) + 1) * args.length - mrg;
            Integer whole_height = maxHeight + border_w + 1;
            op.addRawArgs("-extent", whole_width + "x" + whole_height);
        } else if ("2".equals(type)) {
            Integer whole_width = maxWidth + border_w + 1;
            Integer whole_height = ((mrg / 2) + 1 + border_w + maxHeight + border_w + (mrg / 2) + 1) * args.length - mrg;
            op.addRawArgs("-extent", whole_width + "x" + whole_height);
        }
        op.addImage(newpath);
        try {
            cmd.run(op);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * 压缩图片
     *
     * @param srcImagePath  源图片路径
     * @param destImagePath 目标图片路径
     * @param width         压缩后的宽
     * @param height        压缩后的高
     *                      <p>
     *                      压缩质量（0-100）
     * @return
     * @throws Exception
     */
    public static void resize(String srcImagePath, String destImagePath, int width, int height) throws Exception {
        // 按照原有形状压缩（横图、竖图）
        BufferedImage buffimg = ImageIO.read(new File(srcImagePath));
        int w = buffimg.getWidth();
        int h = buffimg.getHeight();
        if ((w > h && width < height) || (w < h && width > height)) {
            int temp = width;
            width = height;
            height = temp;
        }
        // 压缩-不加水印
        ConvertCmd cmd = getCmd();
        IMOperation op = new IMOperation();
        op.addImage(srcImagePath);
        op.quality(90d);
        op.resize(width, height);
        op.addImage(createDirectory(destImagePath));
        cmd.run(op);
    }

    /**
     * 去除Exif信息，可减小文件大小
     *
     * @param srcImagePath  源图片路径
     * @param destImagePath 目标图片路径
     * @throws Exception
     */
    public static void removeProfile(String srcImagePath, String destImagePath) throws Exception {
        IMOperation op = new IMOperation();
        op.addImage(srcImagePath);
        op.profile("*");
        op.addImage(createDirectory(destImagePath));
        getCmd().run(op);
    }


    /**
     * 创建目录
     *
     * @param path
     * @return path
     */
    private static String createDirectory(String path) {
        File file = new File(path);
        if (!file.exists())
            file.getParentFile().mkdirs();
        return path;
    }

    public static void compressImg(File file) {
        try {
            if (file.length() > MAX_IMG_LENGTH) {
                resize(file.getAbsolutePath(), file.getAbsolutePath(), 1920, 1080);
            }
        } catch (Exception e) {
            logger.error("压缩图片出错", e);
        }
    }

    public static void main(String[] args) throws Exception {
        //addImgText("e://a2.jpg");
        //zoomImage(300, 150, "e://a.jpg", "e://a1.jpg");
        //zoomImage(300, 150, "e://b.jpg", "e://b1.jpg");
        //zoomImage(300, 150, "e://c.jpg", "e://c1.jpg");
        //zoomImage(300, 150, "e://d.jpg", "e://d1.jpg");
        //zoomImage(300, 150, "e://e.jpg", "e://e1.jpg");
        //  zoomImage(300, 150, "e://f.jpg", "e://f1.jpg");  
        //waterMark("e://cc.jpg", "e://aa.jpg", "e://bb.jpg", "southeast", 30);
        //rotate("e://aa.jpg", "e://ee.jpg", 90);
        //System.out.println(showImageInfo("e://aa.jpg"));
//        String[] files = new String[5];
//        files[0] = "e://a1.jpg";
//        files[1] = "e://b1.jpg";
//        files[2] = "e://c1.jpg";
//        files[3] = "e://d1.jpg";
//        files[4] = "e://e1.jpg";
        //montage(files, 280, 200, "e://liboy1.jpg", 0,"2");
        //cropImage("e://a.jpg", "e://liboy22.jpg", 1024, 727, 500, 350);


        //分辨率
        resize("C:\\Users\\chang\\Downloads\\11968\\MTZ.jpg", "C:\\Users\\chang\\Downloads\\11968\\MTZ.jpg", 1920, 1080);
        //去除Exif信息
//        removeProfile("C:\\Users\\chang\\Downloads\\11968\\FR04.jpg","C:\\Users\\chang\\Downloads\\11968\\FR04.jpg"); //无效
    }


}

//如果是在windows下运行，则需要配置ImageMagick的路径（），如果找不到convert的话，把目录下的magick.exe拷贝一份命名convert.exe

//    ConvertCmd convert = new ConvertCmd();
//        convert.setSearchPath("E:\\ImageMagick-7.0.5-Q16");
//                getCmd().run(op);