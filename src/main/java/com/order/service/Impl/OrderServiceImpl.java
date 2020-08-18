package com.order.service.Impl;
import com.order.constant.Result;
import com.order.dao.OrderDao;
import com.order.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.bind.util.JAXBSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/**
 * @author wl
 * @Data 2020-08-11 10:08
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;

    @Override
    public Result getInformations(List<Long> ids) {
        Result result = new Result();
        if (ids.size() == 0){
            result.setCode(200);
            result.setMessage("入参不能为空！");
            return result;
        }


        List<Map<String, Object>> maps = orderDao.queryByList(ids);
        result.setMessage("成功");
        result.setData(maps);
        return result;
    }

    @Override
    public Result selectAll() {
        Result result = new Result();
        List<Map<String, Object>> maps = orderDao.selectAll();
        result.setMessage("成功");
        result.setData(maps);
        return result;
    }
}
