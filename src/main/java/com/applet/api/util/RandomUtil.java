package com.applet.api.util;

import com.applet.api.util.constant.Constants;
import jodd.datetime.JDateTime;

import java.util.Random;
import java.util.UUID;

/**
 * 随机数
 * @author zhouhuahu
 */
public class RandomUtil {

    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

    public static String getRandomStr32() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().replace("-", "");
    }

    public static String getLakalaTimeStamp() {
        //yyyyMMddHHmmss+6位不重复随机数或序 列，不能重复
        JDateTime now = new JDateTime();
        String str6 = ((int)((Math.random() * 9 + 1) * 100000)) + "";
        return now.toString(Constants.DEFAULT_DATE_FORMAT_STAMP) + str6;
    }

    public static String getOrderTime(){
        JDateTime now = new JDateTime();
        return now.toString(Constants.DEFAULT_DATE_FORMAT_STAMP);
    }

    public static String orderEffTime(){
        JDateTime now = new JDateTime();
        return now.addMinute(15).toString(Constants.DEFAULT_DATE_FORMAT_STAMP);
    }

    public static String getAgentOrder() {
        return "AP" + System.currentTimeMillis();
    }

    public static String getRemitBatchNo(String type){
        return  getOrderTime() + type;
    }

    /**
     * 生成既定长度的纯数字字符串
     * @param length
     * @return
     */
    public static String getRandomStr(Integer length){
        Random random = new Random();
        String str = "";
        for (int i = 0; i < length; i++) {
            str += random.nextInt(10);
        }
        return str;
    }

    /**
     * 生成订单号
     * @param managerId
     * @return
     */
    public static String getMerNo(Integer managerId) {
        return managerId + "-" + new JDateTime().toString(Constants.DEFAULT_DATE_FORMAT_STAMP);
    }

    public static void main(String args[]){
        String pwd = getRandomStr(6);
        System.out.print(pwd);
    }

    /**
     * 获取指定长度纯数字字符串
     * @param length
     * @return
     */
    public static String getCode(int length){
        Random rm = new Random();
        // 获得随机数
        double pross = (1 + rm.nextDouble()) * Math.pow(10, length);
        // 将获得的获得随机数转化为字符串
        String fixLenthString = String.valueOf(pross);
        // 返回固定的长度的随机数
        return fixLenthString.substring(1, length + 1);
    }

}
