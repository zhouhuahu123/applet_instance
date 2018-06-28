package com.applet.api.util;

import jodd.datetime.JDateTime;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * 时间处理类
 * @author zhouhuahu
 */
public class JDateUtil {

    public static final String DEFAULT_DATE_FORMAT_JDATE = "YYYY-MM-DD hh:mm:ss";
    public static final String DEFAULT_DATE_FORMAT_JDATE_2 = "YYYY-MM-DD";

    /**
     * 格式化时间
     *
     * @param object
     * @param format
     * @return
     */
    public static final String toFormat(Object object, String format) {
        JDateTime date = toFormat(object);
        if (null == date) {
            return "";
        }
        return date.toString(format);
    }

    public static final JDateTime toFormat(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Date) {
            return new JDateTime((Date) object);
        }
        if (object instanceof String) {
            if ((String) object == "0000-00-00 00:00:00" || ((String) object).equals("")) {
                return null;
            }
            try {
                return new JDateTime((String) object);
            } catch (Exception e) {
                return null;
            }
        }
        return null;
    }

    public static final Date toFormat(JDateTime jDateTime, String format) {
        return new JDateTime(jDateTime.toString(format)).convertToDate();
    }

    public static final String toFormatStr(JDateTime jDateTime, String format) {
        return jDateTime.toString(format);
    }

    public static final Date toCurrFormat(String format) {
        return toFormat(new JDateTime(new Date()), format);
    }

    public static final String toCurrFormatStr(String format) {
        return new JDateTime(new Date()).toString(format);
    }

    public static long getDifferRealDays(JDateTime largeDate, JDateTime smallDate) {
        largeDate = new JDateTime(largeDate.toString(DEFAULT_DATE_FORMAT_JDATE_2));
        smallDate = new JDateTime(smallDate.toString(DEFAULT_DATE_FORMAT_JDATE_2));
        long quot = getDifferMilliseconds(largeDate, smallDate);
        quot = quot / 1000 / 60 / 60 / 24;
        return quot;
    }

    public static long getDifferMilliseconds(JDateTime largeDate, JDateTime smallDate) {
        long quot = largeDate.getTimeInMillis() - smallDate.getTimeInMillis();
        return quot;
    }

    /**
     * 计算转换距现在时间(app订单列表使用)
     *
     * @param object
     * @return
     */
    public static final String subCurr(Object object) {
        JDateTime date = toFormat(object);
        JDateTime now = new JDateTime(new Date());
        if (date == null) {
            return "";
        }
        long i = getDifferRealDays(now, date);
        if (i < 1) {
            int hour = date.getHour();
            return hour > 12 ? "下午" + date.addHour(-12).toString("hh:mm") : "上午" + date.toString("hh:mm");
        } else if (i >= 1 && i < 2) {
            return "昨天";
        } else if (i >= 2 && i < 7) {
            int day1 = now.getDayOfWeek();
            int day2 = date.getDayOfWeek();
//            System.out.println(day1 + "\n" + day2);
            if (day1 > day2) {
                String[] weekDays = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
                return weekDays[day2 - 1];
            }
        }
        return date.toString(DEFAULT_DATE_FORMAT_JDATE_2);
    }


    public static void main(String[] args) {
        System.out.println(subCurr("2017-06-23 0:23:00"));
    }
}
