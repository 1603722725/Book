package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLog implements Serializable{
  private static final Long serialVersionUID = 1L;
  private Long id;
  private String username;
  private String bookName;
  private double bookPrice;
  private String operation;
  private Date operationTime;
}
