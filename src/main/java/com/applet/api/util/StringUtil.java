package com.applet.api.util;

/**
 * 字符串工具类
 * @author zhouhuahu
 */
public class StringUtil {

    /**
     * 截取银行卡前6后4
     *
     * @param object
     * @return
     */
    public static final String subAccount(Object object) {
        String str = defaultStr(object);
        StringBuilder temp = new StringBuilder();
        if (!"".equals(str)) {
            int length = str.length();
            if (length >= 16) {
                temp.append(str.substring(0, 6));
                temp.append("********");
                temp.append(str.substring(length - 4, length));
                str = temp.toString();
            } else {
                return "";
            }
        }
        return str;
    }

    /**
     * 截取机具序列号
     *
     * @param object
     * @return
     */
    public static final String subSerialNo(Object object) {
        String str = defaultStr(object);
        StringBuilder temp = new StringBuilder();
        if (!"".equals(str)) {
            int length = str.length();
            if (length >= 11) {
                temp.append(str.substring(0, 3));
                temp.append("******");
                temp.append(str.substring(length - 4, length));
                str = temp.toString();
            } else {
                str = "";
            }
        }
        return str;
    }

    /**
     * 截取机具sim卡号
     *
     * @param object
     * @return
     */
    public static final String subSimMobile(Object object) {
        String str = defaultStr(object);
        StringBuilder temp = new StringBuilder();
        if (!"".equals(str)) {
            int length = str.length();
            if (length >= 11) {
                temp.append(str.substring(0, 3));
                temp.append("******");
                temp.append(str.substring(length - 4, length));
                str = temp.toString();
            } else {
                str = "";
            }
        }
        return str;
    }

    public static final String subStr(Object object, int num) {
        String str = defaultStr(object);
        if (!"".equals(object)) {
            int length = str.length();
            if (num < length) {
                return str.substring(0, num) + "******";
            }
        }
        return str;
    }


    public static final String defaultStr(Object object) {
        if (null == object) {
            return "";
        }
        if (object instanceof String) {
            return (String) ((String) object).trim();
        }
        if (object instanceof Integer) {
            return 0 == ((Integer) object).intValue() ? "" : ((Integer) object).intValue() + "";
        }
        return "";
    }
}
