package com.stwen.mvc.controller;

import com.stwen.mvc.annotation.MyAutowired;
import com.stwen.mvc.annotation.MyController;
import com.stwen.mvc.annotation.MyRequestMapping;
import com.stwen.mvc.annotation.MyRequestParam;
import com.stwen.mvc.service.TestService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ganxianhao
 * @des 测试controller
 * @create 2019/4/1
 */
@MyController
@MyRequestMapping("test")
public class TestController {

    @MyAutowired
    private TestService testService;

    @MyRequestMapping("/test1")
    public void test1(HttpServletRequest req, HttpServletResponse resp, @MyRequestParam("param") String param){
        try {
            testService.testService(param);
            resp.getWriter().write("接收到请求，参数："+param);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
