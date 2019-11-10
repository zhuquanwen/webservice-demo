package com.zqw.test.cxf;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 18:42
 * @since jdk1.8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTets {
    @Test
    public void contextLoads() throws Exception {
        JaxWsDynamicClientFactory clientFactroy = JaxWsDynamicClientFactory.newInstance();
        Client client = clientFactroy.createClient("http://127.0.0.1:8080/services/demo?wsdl");
        Object[] invoke = client.invoke("myTest");
        System.out.println(invoke[0].toString());

        Object[] invoke2 = client.invoke("get", "11");
        System.out.println(invoke2[0].toString());

    }

}
