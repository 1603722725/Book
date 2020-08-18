package com.order.controller;

import com.alibaba.fastjson.JSONArray;
import com.order.constant.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wl
 * @Data 2020-08-17
 */
@RestController
@RequestMapping("hello")
@Api(value = "/api",tags = {"测试"},description = "测试接口API")
public class HelloController {
    @RequestMapping(value = "/aaa",method = RequestMethod.POST)
    @ApiOperation(value = "hello1",httpMethod = "POST",notes = "你好啊！")
    public Result hello(Map map){
        Result result = new Result();
        Map<String,Object> map1 = new HashMap<>();
        map1.put("1","111");
        map1.put("2","222");
        JSONArray jsonArray = new JSONArray();
        jsonArray.add(map1);
        jsonArray.add("123456");
//        result.setData(map1);
        result.setData(jsonArray);
      return result;
    }
}
