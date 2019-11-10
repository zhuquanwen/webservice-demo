package com.zqw.webservice.demo;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/8 21:35
 * @since jdk1.8
 */
public class Client {
    public static void main(String[] args) {
        HelloWorldImplService service = new HelloWorldImplService();
        HelloWorldImpl helloWorld = service.getHelloWorldImplPort();
        String msg = helloWorld.sayHelloWorld("уехЩ");
        System.out.println(msg);
    }
}
