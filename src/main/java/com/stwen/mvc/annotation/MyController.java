package com.stwen.mvc.annotation;

import java.lang.annotation.*;

/**
 * @author ganxianhao
 * @des 自定义controller注解
 * @create 2019/3/30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyController {

    //定义注解的属性，非方法，默认“”
    String value() default "";
}
