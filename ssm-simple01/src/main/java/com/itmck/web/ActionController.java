package com.itmck.web;

import com.itmck.service.UserService;
import com.org.itmck.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Create by it_mck 2019/1/25 16:27
 *
 * @Description:
 * @Version: 1.0
 */
@Controller
public class ActionController {

    @Autowired
    private UserService userService;

    @RequestMapping("gt")
    @ResponseBody
    public User getIndex(String name) {

        return userService.selectByName(name);
    }
    @RequestMapping("gu")
    @ResponseBody
    public User getUser(Long id) {

        return userService.getUser(id);
    }

}
