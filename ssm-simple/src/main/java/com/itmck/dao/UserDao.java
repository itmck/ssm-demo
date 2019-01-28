package com.itmck.dao;

import com.org.itmck.pojo.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Create by it_mck 2019/1/25 17:00
 *
 * @Description:
 * @Version: 1.0
 */
@Repository
public interface UserDao {

    @Select("select * from tb_user where username=#{name}")
    User selectByName(String name);

    @Select("select * from tb_user where id=#{id}")
    User getUser(Long id);
}
