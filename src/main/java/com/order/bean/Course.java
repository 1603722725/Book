package com.order.bean;

import lombok.AllArgsConstructor;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable{
  private static final long serialVersionUID = 1L;
  private long id;
  private String courseNo;
  private String courseName;
  private long bookId;
  private long majorId;
  private String courseType;
  private Date createTime;
}
