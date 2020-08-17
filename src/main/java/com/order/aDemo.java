package com.order;
import com.order.utils.OrderUtils;
import org.apache.commons.lang.StringUtils;

/**
 * @author wl
 * @Data 2020-08-15 12:42
 */
public class aDemo {
    public static void main(String[] args) {
//        String orderCode = OrderUtils.getOrderCode(1);
//        System.out.println(orderCode);
        String[] arr = new String[3];
        arr[0] = "1";
        arr[1] = "2";
        arr[2] = "3";
        String a = StringUtils.join(arr,",");
        System.out.println(a);
    }
}
