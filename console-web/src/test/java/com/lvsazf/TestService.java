package com.lvsazf;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lvsazf.model.OrderDelivery;
import com.lvsazf.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author 路智顺
 * @Description
 * @date 14:51 2019-01-17
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestService {

    @Resource
    private UserService service;

    @Test
    public void testPage() {
        OrderDelivery orderDelivery = new OrderDelivery();
        orderDelivery.setPageSize(2);
        orderDelivery.setPageNum(3);
        PageInfo<OrderDelivery> orderDeliveries = service.selectAll(orderDelivery);
        System.out.println(orderDeliveries);
    }
}
