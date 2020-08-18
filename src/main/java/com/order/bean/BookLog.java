package com.order.bean;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookLog implements Serializable{
  private static final Long serialVersionUID = 1L;
  private Long id;
  private String username;
  private String realName;
  private String courseNo;
  private String remarks;
  private Date submitTime;
}
