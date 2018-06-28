package com.applet.api.core.support;

import com.applet.api.core.spring.EncryptPropertyConfigurer;
import org.slf4j.Logger;

import java.io.IOException;
import java.util.Properties;

/**
 * 服务器启动
 * Created by zhouhuahu on 2018/6/26.
 */
public class AppStart {


    private Logger log = org.slf4j.LoggerFactory.getLogger(AppStart.class);

    public void onStart() throws IOException {
        //这地方可以放缓存数据
        log.info("平台正在启动");
        log.info("版权所有：Copyright © 2016 mdanbao.com");
        log.info("读取配置文件到缓存");
        Properties config = EncryptPropertyConfigurer.getProperties();
        log.info("模板引擎全局变量定义");
    }

    public void onStop() {
        log.info("小程序平台正在关闭...");
    }


}
