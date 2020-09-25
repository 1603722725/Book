package com.order.service;

import com.order.bean.User;
import com.order.constant.Result;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author wl
 * @Data 2020-09-23
 */

public interface UserService {

    User selectOne(String userName);
    Result addUser(User user);
}
