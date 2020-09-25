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
public class Book implements Serializable {
  private static final Long serialVersionUID = 1L;
  private Long id;
  private String name;
  private String author;
  private String press;
  private double price;
  private String isbn;
  private String picture;
  @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
  private Date createTime;
}
