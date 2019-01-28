package com.itmck.service.impl;

import com.itmck.dao.UserDao;
import com.itmck.service.UserService;
import com.org.itmck.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by it_mck 2019/1/25 16:58
 *
 * @Description:
 * @Version: 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User selectByName(String name) {

        return userDao.selectByName(name);
    }

    @Override
    public User getUser(Long id) {
        return userDao.getUser(id);
    }
}
