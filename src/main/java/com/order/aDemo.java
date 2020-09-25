package com.order;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.order.bean.User;
import com.order.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * @author wl
 * @Data 2020-08-15 12:42
 */
public class aDemo {
    @Autowired
    UserService userService;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Date createTime;
    public static void main(String[] args) {
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

    }
}
