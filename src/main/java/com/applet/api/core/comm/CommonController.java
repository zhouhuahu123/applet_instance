package com.applet.api.core.comm;

import com.applet.api.core.spring.DateEditor;
import com.applet.api.core.spring.StringEscapeEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.util.Date;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
public abstract class CommonController {

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringEscapeEditor());
        //对于需要转换为Date类型的属性，使用DateEditor进行处理
        binder.registerCustomEditor(Date.class, new DateEditor());
    }
}
