package com.applet.api.core.anno;

import java.lang.annotation.*;

/**
 * session获取参数 注解
 *
 * @author zhouhuahu
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface SessionScope {
    String value();
}
