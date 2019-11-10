package com.zqw.test.cxf;

import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 19:43
 * @since jdk1.8
 */

@Component
public class JsonProvider extends ArrayList<JacksonJaxbJsonProvider> {

    // 在构造方法中, 添加JacksonJaxbJsonProvider
    public JsonProvider() {
        this.add(new JacksonJaxbJsonProvider());
    }

}