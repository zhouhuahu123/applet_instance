package com.applet.api.controller;

import com.applet.api.config.WechatAppletConfig;
import com.applet.api.core.anno.IgnorePermission;
import com.applet.api.core.anno.SessionScope;
import com.applet.api.entity.AppletInfo;
import com.applet.api.entity.WeChantInfo;
import com.applet.api.service.AppletService;
import com.applet.api.service.WeChantService;
import com.applet.api.util.ajax.AjaxResponse;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
@RestController
@RequestMapping(value = "/applet")
public class WeChantController {
    private static final Logger logger = LoggerFactory.getLogger(WeChantController.class);
    @Autowired
    private WeChantService weChantService;

    /**
     * 授权登录
     * @param code
     * @return
     */
    @RequestMapping(value = "/login")
    @IgnorePermission
    public Object login(@SessionScope("appletInfo") AppletInfo appletInfo, @Param("code") String code){
        try {
            String openId = WechatAppletConfig.getOpenId(code, appletInfo.getAppId(), appletInfo.getAppSecret());
            WeChantInfo info = weChantService.selectWeChantInfo(openId);
            return AjaxResponse.success(info.getId());
        } catch (Exception e) {
            logger.info("授权登录出错{}", e);
            return AjaxResponse.error("授权登录出错");
        }
    }

}
