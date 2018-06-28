package com.applet.api.util.ajax;

import com.applet.api.util.constant.Constants;
import jodd.util.StringUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * AJAX响应工具类
 * @author zhouhuahu
 */
public class AjaxResponse {

    public static Map<String, Object> success(Object data) {
        return msg(Constants.SUCCESS_CODE, data);
    }

    public static Map<String, Object> success() {
        return success(null);
    }

    public static Map<String, Object> error(String errorMsg) {
        return msg(Constants.ERROR_CODE, errorMsg);
    }

    public static Map<String, Object> msg(String code, Object data) {
        Map<String, Object> ret = new HashMap();
        ret.put("code", code);
        if (data != null) {
            ret.put("data", data);
        } else {
            ret.put("data", "");
        }
        return ret;
    }

    public static Map<String,Object> expired(){
        return msg(Constants.EXPIRED_CODE,"登录过期，请重新登录");
    }

    public static Map<String, Object> pageBean(boolean success, int totalRows, int curPage, Object data) {
        Map<String, Object> ret = new HashMap();
        ret.put("success", success);
        ret.put("totalRows", totalRows);
        ret.put("curPage", curPage);
        ret.put("data", data);
        return ret;
    }

    public static Map<String, Object> valid(boolean success, String msg) {
        Map<String, Object> ret = new HashMap();
        if (success) {
            ret.put("ok", " ");
        } else {
            ret.put("error", StringUtil.toSafeString(msg));
        }
        return ret;
    }
}
