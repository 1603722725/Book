package com.order.controller;

import com.order.bean.ShiroUser;
import com.order.bean.User;
import com.order.constant.Result;
import com.order.constant.ResultCode;
import com.order.service.UserService;
import com.order.utils.MD5Util;
import com.order.utils.VerificationCode;
import io.swagger.annotations.Api;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Date;

/**
 * @author wl
 * @Data 2020-08-18
 */
@RestController
@RequestMapping("login")
//@Api(value = "/api",tags = {"登录"},description = "登录接口API")
public class LoginController {
    private Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestBody User user) {
        Result result = new Result();
        Subject subject = SecurityUtils.getSubject();
        user.setPassword(MD5Util.encrypt(user.getPassword()));
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            log.warn("登陆失败");
            result.setCode(401);
            result.setMessage("账号或密码错误");
            return result;
        }
        result.setMessage("登录成功！");
        return result;
    }

    @GetMapping("/verifyCode")
    public void verifyCode(HttpServletRequest request, HttpServletResponse resp) throws IOException{
        VerificationCode code = new VerificationCode();
        BufferedImage image = code.getImage();
        String text = code.getText();
        HttpSession session = request.getSession(true);
        session.setAttribute("verify_code", text);
        VerificationCode.output(image,resp.getOutputStream());
    }
    @RequestMapping(value = "/add", method = {RequestMethod.GET})
    public Result add() {
        Result result = new Result();
        User user = new User();
        user.setUserName("201719154332");
        user.setPassword("123456");
        user.setSalt("2a5c");
        user.setDisable(0);
        user.setRealName("徐雨欣");
        user.setUserClass("RB软工金173");
        user.setRoleId(Long.valueOf(1));
        user.setBalance(Double.valueOf(33.22));
        user.setMajorId(Long.valueOf(1));
        user.setEmail("22@qq.com");
        user.setCreateTime(new Date());
        result = userService.addUser(user);
        return result;
    }

}