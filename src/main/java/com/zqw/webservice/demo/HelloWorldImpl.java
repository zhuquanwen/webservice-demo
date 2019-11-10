package com.zqw.webservice.demo;

import javax.jws.WebService;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/8 21:32
 * @since jdk1.8
 */
@WebService
public class HelloWorldImpl implements IHelloWorld {
    @Override
    public String sayHelloWorld(String username) {
        return "hello," + username + ",you are my world";
    }
}
