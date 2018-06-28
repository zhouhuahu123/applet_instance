package com.applet.api.interceptor;

import com.applet.api.core.anno.IgnorePermission;
import com.applet.api.entity.AppletInfo;
import com.applet.api.entity.WeChantInfo;
import com.applet.api.service.AppletService;
import com.applet.api.service.WeChantService;
import com.applet.api.util.NullUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
public class AppletInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(AppletInterceptor.class);
    @Autowired
    private WeChantService weChantService;
    @Autowired
    private AppletService appletService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        logger.info("初始化访问者信息...");
        String appletCode = request.getParameter("appletCode").toString();
        if (NullUtil.isNullOrEmpty(appletCode)){
            return false;
        }
        AppletInfo appletInfo = appletService.selectAppletInfo(appletCode);
        if (appletInfo == null || !appletInfo.getStatus()){
            return false;
        }
        request.getSession().setAttribute("appletInfo", appletInfo);

        HandlerMethod handleMethod = (HandlerMethod) handler;
        IgnorePermission per  = handleMethod.getMethodAnnotation(IgnorePermission.class);
        if (per != null){
            return true;
        }
        String weChantId = request.getParameter("weChantId").toString();
        if ( NullUtil.isNullOrEmpty(weChantId)){
            return false;
        }
        WeChantInfo weChantInfo = weChantService.selectWeChantInfo(weChantId);
        if (weChantInfo == null || !weChantInfo.getStatus()){
            return false;
        }
        request.getSession().setAttribute("weChantInfo", weChantInfo);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("清除访问者信息...");
        request.getSession().removeAttribute("appletInfo");
        request.getSession().removeAttribute("weChantInfo");
    }
}
