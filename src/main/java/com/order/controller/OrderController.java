package com.order.controller;
import com.order.constant.Result;
import com.order.service.OrderService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
/*
 * @author wl
 * @Data 2020-08-11 10:14
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderService orderService;
    @RequestMapping(value = "/getOrder",method = RequestMethod.POST)
    public Result GetOrder(){
        List<Long> list = new ArrayList<>();
        list.add((long) 1);
        list.add((long) 2);
        Result result = new Result();
        result = orderService.getInformations(list);
        return result;
    }
    @RequestMapping(value = "/all",method = RequestMethod.POST)
    public Result selectAll(){
        Result result = new Result();
        result = orderService.selectAll();
        return result;
    }
}
