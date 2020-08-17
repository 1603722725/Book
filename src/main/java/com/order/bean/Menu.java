package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Menu implements Serializable{
  private static final long serialVersionUID = 1L;
  private long id;
  private long parentid;
  private String name;
  private String icon;
  private String url;
  private String disable;
}
