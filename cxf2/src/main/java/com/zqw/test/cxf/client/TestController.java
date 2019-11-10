package com.zqw.test.cxf.client;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.zqw.test.cxf.model.Demo;
import org.apache.cxf.jaxrs.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 20:50
 * @since jdk1.8
 */
@RestController
public class TestController {

    // 注入配置的转json工具
    @Autowired
    private List<JacksonJaxbJsonProvider> jsonProvider;

    @RequestMapping("/findById")
    @ResponseBody
    public Demo findById() {
        //调用webservice获取查询数据
        Demo demo = WebClient
                .create("http://localhost:9001/services/demoservice/find/1", jsonProvider)
                .accept(MediaType.APPLICATION_JSON).get(Demo.class);
        return demo;
    }

}
