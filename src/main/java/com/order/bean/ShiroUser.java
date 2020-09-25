package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wl
 * @Data 2020-09-23
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShiroUser {
    private long id;
    private String username;
    private String password;
    private String salt;
    private Integer disable;
    private Integer roleId;
}
