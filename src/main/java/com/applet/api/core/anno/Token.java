package com.applet.api.core.anno;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 基于Token的防重复提交 注解
 * @author zhouhuahu
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Token {

	boolean save() default false;

	boolean check() default false;

	boolean saveForCheck() default false;

	boolean checkInDb() default false;
}
