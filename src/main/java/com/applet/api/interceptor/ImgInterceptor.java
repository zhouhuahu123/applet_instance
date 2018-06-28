package com.applet.api.interceptor;

import com.applet.api.util.NullUtil;
import com.applet.api.util.qiniu.Config;
import com.applet.api.util.qiniu.QiniuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhouhuahu on 2018/6/13.
 */
public class ImgInterceptor extends HandlerInterceptorAdapter {
    private static final Logger log = LoggerFactory.getLogger(ImgInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();
        requestUri = requestUri.replaceAll("/applet_instance","");
        //log.info("获取图片路径{}", requestUri);
        if (NullUtil.isNotNullOrEmpty(requestUri) && QiniuUtil.existsFile(Config.bucketAppletPrivate, requestUri)){
            String url = QiniuUtil.generateQiniuPrivateDownURL(requestUri);
            //log.info("七牛云路径：" + url);
            response.sendRedirect(url);
            return false;
        }
        return true;
    }
}
