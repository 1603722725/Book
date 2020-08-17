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
  private static final long serialVersionUID = 1L;
  private long id;
  private String username;
  private String password;
  private String salt;
  private long disable;
  private String realName;
  private String userClass;
  private long roleId;
  private double balance;
  private long majorId;
  private String email;
  private Date createTime;
}
