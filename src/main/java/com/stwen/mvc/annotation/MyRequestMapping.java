package com.stwen.mvc.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author ganxianhao
 * @des 自定义RequestMapping 映射请求注解
 * @create 2019/3/30
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyRequestMapping {

    //定义注解的属性，非方法,必填
    String value();
}
