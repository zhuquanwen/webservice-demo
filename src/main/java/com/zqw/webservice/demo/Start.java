package com.zqw.webservice.demo;

import javax.xml.ws.Endpoint;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/8 21:14
 * @since jdk1.8
 */
public class Start {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8788/helloworld", new HelloWorldImpl());
        System.out.println("webservice服务已启动");
    }
}
