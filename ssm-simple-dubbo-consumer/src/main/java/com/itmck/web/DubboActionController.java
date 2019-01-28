package com.itmck.web;

import com.itmck.org.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Create by it_mck 2019/1/26 20:04
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
public class DubboActionController {

    /**    这里应该声明一个Service ,但是刚才说过Service会最终成为一个web项目,也就是说我们无法直接注入依赖,但此时我们仍需要声明对象.
     *      怎么办?
     *     解决方案:
     *      我们将Service的接口声明和实现进行拆分.将service创建为一个jar项目.创建的好处,是除了controller需要需要使用service接口.
     *      我们的接口实现也需要使用此接口.这样就降低代码重复性.
     *
     *
     */
    @Resource
    private DemoService demoService;

    @RequestMapping("consumer")
    @ResponseBody
    public String getString(String name){
        //这里调用service方法
        String s = demoService.sayHello(name);
        return s;

    }

}