package com.lvsazf.mapper;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageInfo;
import com.lvsazf.model.OrderDelivery;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderDeliveryMapper {
    int deleteByPrimaryKey(Long deliveryId);

    int insert(OrderDelivery record);

    int insertSelective(OrderDelivery record);

    OrderDelivery selectByPrimaryKey(Long deliveryId);

    int updateByPrimaryKeySelective(OrderDelivery record);

    int updateByPrimaryKey(OrderDelivery record);

    PageInfo<OrderDelivery> selectAll(OrderDelivery orderDelivery);
}