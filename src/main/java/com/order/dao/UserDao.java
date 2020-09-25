package com.order.dao;

import com.order.bean.User;

import java.util.Map;

/**
 * @author wl
 * @Data 2020-08-17
 */
public interface UserDao {
    User selectOne(String userName);
    int insert(User user);
}
