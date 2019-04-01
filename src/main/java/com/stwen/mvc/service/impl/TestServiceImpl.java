package com.stwen.mvc.service.impl;

import com.stwen.mvc.annotation.MyService;
import com.stwen.mvc.service.TestService;

/**
 * @author ganxianhao
 * @des
 * @create 2019/4/1
 */
@MyService
public class TestServiceImpl implements TestService {
    @Override
    public void testService(String param)  throws Exception{
        System.out.println("service接收到请求，参数："+param);
    }
}
