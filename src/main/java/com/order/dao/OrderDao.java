package com.order.dao;
import java.util.List;
import java.util.Map;
/**
 * @author wl
 * @Data 2020-08-11 9:34
 */
public interface OrderDao {
    List<Map<String,Object>> queryByList(List<Long> id);
}
