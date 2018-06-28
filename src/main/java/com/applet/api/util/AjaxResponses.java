package com.applet.api.util;
import com.applet.api.util.page.Page;
import java.util.HashMap;
import java.util.Map;
import static com.applet.api.core.constants.ResConstants.RES_CODE_42001;
import static com.applet.api.core.constants.ResConstants.RES_CODE_42002;


/**
 * app
 * Created by chang on 2017/2/24.
 */
public class AjaxResponses {
    final public static String SUCCESS = "1";
    final public static String ERROR = "-1";

    public static Map<String, Object> success(Object data) {
        return msg(SUCCESS, data);
    }

    public static Map<String, Object> success() {
        return msg(SUCCESS, null);
    }

    public static Map<String, Object> error(String code, String msg) {
        return json(ERROR, code, msg);
    }

    public static Map<String, Object> resPage(Page page) {
        if (page != null) {
            if (page.getData().size() > 0) {
                Map map = new HashMap();
                map.put("rows", page.getData());
                map.put("pageNum", page.getPageNum());
                map.put("pageSize", page.getLength());
                return success(map);
            } else {
                if (page.getPageNum() > 1) {
                    return error(RES_CODE_42002, "没有数据了");
                } else {
                    return error(RES_CODE_42001, "暂无数据");
                }
            }
        } else {
            return error(RES_CODE_42001, "暂无数据");
        }
    }

    public static Map<String, Object> msg(String status, Object data) {
        Map<String, Object> ret = new HashMap();
        ret.put("status", status);
        if (data != null) {
            ret.put("data", data);
        }
        return ret;
    }

    public static Map<String, Object> json(String status, String code, String msg) {
        Map<String, Object> ret = new HashMap();
        ret.put("status", status);
        ret.put("code", code);
        ret.put("msg", msg);
        return ret;
    }

    public static Map<String, Object> json(String status, String code, Object data) {
        Map<String, Object> ret = new HashMap();
        ret.put("status", status);
        ret.put("code", code);
        if (data != null) {
            ret.put("data", data);
        }
        return ret;
    }

    public static Map<String, Object> dataTables(Page page) {
        Map<String, Object> ret = new HashMap();
        ret.put("rows", page.getData());
        ret.put("total", page.getTotal());
        return ret;
    }
}

