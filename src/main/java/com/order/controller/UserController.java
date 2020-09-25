package com.order.controller;

import com.order.bean.User;
import com.order.constant.Result;
import com.order.service.UserService;
import com.order.utils.MD5Util;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.PropertyAccessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;
import com.order.bean.User;

import javax.annotation.Resource;

/**
 * @author wl
 * @Data 2020-08-18
 */
@RestController
@RequestMapping("user")
public class UserController {
    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/selectOne", method = RequestMethod.POST)
    public Result selectOne01(String userName){
        Result result = new Result();
        User user = userService.selectOne(userName);
        result.setData(user);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public Result addUser(@RequestBody Map param){
        Result result = new Result();
        User user = new User();
        user.setUserName(String.valueOf(param.get("userName")));
        user.setPassword(MD5Util.encrypt(String.valueOf(param.get("password"))));
        user.setSalt(String.valueOf(MD5Util.getSalt()));
        user.setDisable(0);
        user.setRealName(String.valueOf(param.get("realName")));
        user.setUserClass(String.valueOf(param.get("userClass")));
        user.setRoleId(Long.valueOf((String) param.get("roleId")));
        user.setBalance(0);
        user.setMajorId(Long.valueOf((String) param.get("majorId")));
        user.setEmail(String.valueOf(param.get("email")));
        user.setCreateTime(new Date());
        result = userService.addUser(user);
        return result;
    }
}
