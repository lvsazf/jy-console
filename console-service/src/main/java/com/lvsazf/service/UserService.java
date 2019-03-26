package com.lvsazf.service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lvsazf.model.OrderDelivery;

public interface UserService {

	OrderDelivery findByUserId(Long id);

    PageInfo<OrderDelivery> selectAll(OrderDelivery orderDelivery);
}
