package com.lvsazf.service.impl;

import com.github.pagehelper.PageInfo;
import com.lvsazf.core.annotation.Log;
import com.lvsazf.mapper.OrderDeliveryMapper;
import com.lvsazf.model.OrderDelivery;
import com.lvsazf.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private OrderDeliveryMapper mapper;

    @Override
    @Log(message = "orderDelivery")
    public OrderDelivery findByUserId(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public PageInfo<OrderDelivery> selectAll(OrderDelivery orderDelivery) {
        return mapper.selectAll(orderDelivery);
    }
}
