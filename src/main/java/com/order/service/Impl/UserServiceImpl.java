package com.order.service.Impl;

import com.order.bean.User;
import com.order.constant.Result;
import com.order.dao.UserDao;
import com.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.stereotype.Service;

import javax.lang.model.util.ElementScanner6;

/**
 * @author wl
 * @Data 2020-09-23
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public User selectOne(String userName) {
        User user = userDao.selectOne(userName);
        return user;
    }

    @Override
    public Result addUser(User user) {
        Result result = new Result();
        int a = userDao.insert(user);
        if (a==0)
            result.setMessage("插入失败");
        result.setMessage("成功");
        return result;
    }
}
