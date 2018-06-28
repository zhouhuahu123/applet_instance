package com.applet.api.util;

import com.applet.api.entity.WeChantInfo;
import com.applet.api.util.constant.Constants;
import com.orangefunction.tomcat.redissessions.RedisSessionManager;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author zhouhuahu on 2018/6/26.
 */
public class NullUtil {
    private static RedisSessionManager manager = null;

    /**
     * 判断字符串是否为空
     * @param str
     * @return
     */
    public static boolean isNullOrEmpty(String str){
        if(null == str)
            return true;
        else
            return str.trim().equals("") ? true : false;
    }

    /**
     * 判断字符串是否不为空
     * @param str
     * @return
     */
    public static boolean isNotNullOrEmpty(String str){
        return !isNullOrEmpty(str);
    }


    /**
     * 判断整型是否不为空
     * @param num
     * @return
     */
    public static boolean isNotNullOrEmpty(Integer num){
        return null == num ? false : true;
    }

    /**
     * 判断List对象是否为空
     * @param list
     * @return
     */
    public static boolean isNotNullOrEmpty(List list){
        return (null != list && list.size() > 0) ? true : false;
    }


    public static WeChantInfo getRedisManger(String sessionId) {
        try {
            HttpSession session = manager.findSession(sessionId).getSession();
            WeChantInfo w = (WeChantInfo) SerializeUtil.unserialize((byte[]) session.getAttribute(Constants.SESSION_WE_CHANT_INFO));
            if (w == null) {
                w = (WeChantInfo) SerializeUtil.unserialize((byte[]) session.getAttribute(Constants.SESSION_WE_CHANT_INFO));
            }
            return w;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

}
