package com.itmck.service;

import com.org.itmck.pojo.User;

/**
 * Create by it_mck 2019/1/25 16:55
 *
 * @Description:
 * @Version: 1.0
 */
public interface UserService {
    /**
     * 获取用户
     * @param name
     * @return
     */
    User selectByName(String name);

    User getUser(Long id);
}
