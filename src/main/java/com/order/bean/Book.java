package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {
  private static final long serialVersionUID = 1L;
  private long id;
  private String name;
  private String author;
  private String press;
  private double price;
  private String isbn;
  private String picture;
  private Date createTime;
}
