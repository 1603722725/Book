package com.order.service.Impl;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.order.constant.Result;
import com.order.constant.ResultCode;
import com.order.dao.OrderDao;
import com.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.xml.bind.util.JAXBSource;
import java.util.List;
import java.util.Map;
/**
 * @author wl
 * @Data 2020-08-11 10:08
 */
@Service
@Transactional
public class OrderServiceImpl implements OrderService {
//    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(OrderServiceImpl.class);
    @Resource
    private OrderDao orderDao;

    @Override
    public Result getInformations(List<Long> ids) {
        Result result = null;
        if (ids == null){
            result.setCode(500);
            result.setMessage("入参不能为空！");
            return result;
        }
        List<Map<String, Object>> maps = orderDao.queryByList(ids);
        JSONArray jsonArray = new JSONArray();
        result = (Result) maps;
        return result;
    }
}
