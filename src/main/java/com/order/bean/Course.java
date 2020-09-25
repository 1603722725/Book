package com.order.bean;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Course implements Serializable{
  private static final Long serialVersionUID = 1L;
  private Long id;
  private String courseNo;
  private String courseName;
  private Long bookId;
  private Long majorId;
  private String courseType;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date createTime;
}
