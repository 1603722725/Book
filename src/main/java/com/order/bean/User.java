package com.order.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
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
  private String userName;
  private String password;
  private String salt;
  private Integer disable;
  private String realName;
  private String userClass;
  private Long roleId;
  private double balance;
  private Long majorId;
  private String email;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date createTime;
}
