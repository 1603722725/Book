package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable{
  private static final Long serialVersionUID = 1L;
  private Long id;
  private String username;
  private String password;
  private String salt;
  private Long disable;
  private String realName;
  private String userClass;
  private Long roleId;
  private double balance;
  private Long majorId;
  private Long deptId;
  private String email;
  private Date createTime;
}
