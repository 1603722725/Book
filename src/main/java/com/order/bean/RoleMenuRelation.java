package com.order.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleMenuRelation implements Serializable{
  private static final Long serialVersionUID = 1L;
  private Long id;
  private Long roleId;
  private Long menuId;
}
