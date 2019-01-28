package com.itmck.service.impl;

import com.itmck.org.service.DemoService;

/**
 * Create by it_mck 2019/1/25 18:41
 *
 * @Description:
 * @Version: 1.0
 */
//@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
