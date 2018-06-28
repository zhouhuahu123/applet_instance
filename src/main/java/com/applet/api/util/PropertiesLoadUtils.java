package com.applet.api.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 配置文件读取处理类
 * @author zhouhuahu
 */
public class PropertiesLoadUtils {

    // 定义配置文件路径
    private static final String propertyPath = "/config/properties/config.properties";
    private static Logger log = LoggerFactory.getLogger(PropertiesLoadUtils.class);

    //是否正式环境
    public static boolean isRun() {
        String runtime = readValue("runtime");
//		log.info("runtime = {}",runtime);
        if (null != runtime && runtime.equals("run")) {
            return true;
        } else {
            return false;
        }
    }

    //是否正式环境
    public static boolean isTask() {
        String runtime = readValue("isTask");
//		log.info("runtime = {}",runtime);
        if (null != runtime && runtime.equals("true")) {
            return true;
        } else {
            return false;
        }
    }


    // 获取指定key值信息
    public static String readValue(String key) {
        Properties props = new Properties();
        try {
            InputStream in = PropertiesLoadUtils.class.getResourceAsStream(propertyPath);
            props.load(in);
            String value = props.getProperty(key);
            return value;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    // 获取所有键值信息
    public static Map<String, String> readProperties() {
        Properties props = new Properties();
        Map map = null;
        try {
            InputStream in = PropertiesLoadUtils.class.getResourceAsStream(propertyPath);
            props.load(in);
            Enumeration en = props.propertyNames();
            map = new HashMap();
            while (en.hasMoreElements()) {
                String key = (String) en.nextElement();
                String value = props.getProperty(key);
                map.put(key, value);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}
