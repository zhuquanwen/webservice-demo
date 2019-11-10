package com.zqw.test.cxf;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 18:18
 * @since jdk1.8
 */

import org.springframework.stereotype.Component;

import javax.jws.WebService;

@WebService(serviceName = "demo", //web服务名称
        endpointInterface = "com.zqw.test.cxf.DemoService",//接口全包名
        targetNamespace = "http://webservices.client.test.zqw.com")
@Component
public class DemoServiceImpl implements DemoService {
    @Override
    public String myTest() {
        System.out.println(1111);
        return "Hello World!";
    }

    @Override
    public String get(String id) {
        return "test hello world";
    }
}
