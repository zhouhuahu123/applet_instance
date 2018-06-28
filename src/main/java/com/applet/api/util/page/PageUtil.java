package com.applet.api.util.page;

import com.applet.api.core.constants.PUBConstants;
import com.applet.api.util.NullUtil;
import com.mysql.jdbc.StringUtils;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zhouhuahu on 2018/6/26.
 */
public class PageUtil {

    /**
     * 分页参数自动封装
     * @param request
     * @return
     */
    public static Page initPage(HttpServletRequest request) {

        String cur = request.getParameter("page");
        if(NullUtil.isNullOrEmpty(cur)){
            cur = request.getParameter("curPage");
        }
        String size = request.getParameter("pageSize");
        cur =  StringUtils.isNullOrEmpty(cur) ? null : cur;
        size = StringUtils.isNullOrEmpty(size) ? null : size;
        int curPage = (cur == null ? 1 : Integer.parseInt(cur));
        int pageSize = (size == null ? PUBConstants.DEFAULT_PAGESIZE : Integer.parseInt(size));
        return new Page(curPage, pageSize);
    }

    /**
     * 分页参数自动封装
     * @return
     */
    public static Page initPage() {
        int curPage = 1;
        int pageSize = PUBConstants.DEFAULT_PAGESIZE;
        return new Page(curPage, pageSize);
    }
}
