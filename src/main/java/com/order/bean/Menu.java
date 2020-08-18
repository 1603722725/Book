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
  private static final Long serialVersionUID = 1L;
  private Long id;
  private Long parentid;
  private String name;
  private String icon;
  private String url;
  private String disable;
}
