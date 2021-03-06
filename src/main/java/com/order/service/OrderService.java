package com.order.service;

import com.order.constant.Result;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-08-11 10:07
 */
public interface OrderService {
    Result getInformations(List<Long> ids);
    Result selectAll();
}
