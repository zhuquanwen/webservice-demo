package com.zqw.test.cxf;

import org.apache.cxf.service.Service;
import org.springframework.stereotype.Component;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 18:14
 * @since jdk1.8
 */
@WebService(name = "demo", targetNamespace = "http://webservices.client.test.zqw.com")
//@Component
public interface DemoService {

    @WebMethod
    public String myTest();

    @WebMethod
    public String get(@WebParam(name = "id") String id);
}
