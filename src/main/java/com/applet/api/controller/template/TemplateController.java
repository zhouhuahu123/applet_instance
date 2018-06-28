package com.applet.api.controller.template;

import com.applet.api.core.anno.SessionScope;
import com.applet.api.entity.AppletInfo;
import com.applet.api.entity.WeChantInfo;
import com.applet.api.service.template.TemplateService;
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
 * Created by zhouhuahu on 2018/6/27.
 */
@RestController
@RequestMapping(value = "/applet/template")
public class TemplateController {
    private static final Logger logger = LoggerFactory.getLogger(TemplateController.class);
    @Autowired
    private TemplateService templateService;

    /**
     * 加载页面信息
     * @param appletInfo
     * @param pageLogo
     * @return
     */
    @RequestMapping(value = "/loadPage")
    public Object loadPage(@SessionScope("appletInfo") AppletInfo appletInfo, @Param("pageLogo") String pageLogo){
        try {
            Map map = templateService.selectTemplateInfo(appletInfo.getId(), appletInfo.getTemplateId(), pageLogo);
            if (!map.isEmpty()){
                map.put("appletName", appletInfo.getName());
                return AjaxResponse.success(map);
            }
        } catch (Exception e) {
            logger.info("加载页面出错{}", e);
        }
        return AjaxResponse.error("加载主页出错");
    }
}
