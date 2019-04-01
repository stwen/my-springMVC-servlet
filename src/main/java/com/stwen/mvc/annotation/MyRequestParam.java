package com.stwen.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author ganxianhao
 * @des 自定义RequestParam 请求参数注解
 * @create 2019/3/30
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyRequestParam {
    //定义注解的属性，非方法,必填
    String value();
}
