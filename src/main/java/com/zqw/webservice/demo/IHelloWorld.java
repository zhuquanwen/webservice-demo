package com.zqw.webservice.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/8 21:10
 * @since jdk1.8
 */
@WebService
public interface IHelloWorld {
    @WebMethod
    String sayHelloWorld(String username);
}
