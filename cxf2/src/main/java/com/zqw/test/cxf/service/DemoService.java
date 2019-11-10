package com.zqw.test.cxf.service;

import com.zqw.test.cxf.model.Demo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * //TODO
 *
 * @author zhuquanwen
 * @vesion 1.0
 * @date 2019/11/10 20:29
 * @since jdk1.8
 */
@Service
public class DemoService implements IDemoService {
    public static List<Demo> demoList = new ArrayList<>();

    static {
        demoList = Arrays.asList(
                new Demo(0, "name1"),
                new Demo(1, "name2"),
                new Demo(2, "name3")
        );
    }
    @Override
    public Demo findById(Integer id) {
        return demoList.get(id);
    }

    @Override
    public boolean deleteById(Integer id) {
        return demoList.remove(id);
    }

    @Override
    public boolean add(Integer id, String name) {
        Demo demo = new Demo(id, name);
        return demoList.add(demo);
    }

    @Override
    public boolean edit(Integer id, String name) {
        Demo demo = demoList.get(id);
        demo.setName(name);
        return true;
    }

}
