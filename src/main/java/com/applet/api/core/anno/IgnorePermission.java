package com.applet.api.core.anno;




import com.applet.api.core.enums.IgnoreType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnorePermission {
    IgnoreType value() default IgnoreType.ALL;
}
