package com.lvsazf.controller;

import com.lvsazf.core.annotation.ResponseResult;
import com.lvsazf.model.OrderDelivery;
import com.lvsazf.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@ResponseResult
@RestController
public class UserController {

    @Resource
    private UserService service;

    @GetMapping(value = "/hello")
    public OrderDelivery hello(@RequestParam("id") Long id) {
        return service.findByUserId(id);
    }


}
