package com.lvsazf.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lvsazf.mapper.CodeMapper;
import com.lvsazf.model.Code;
import com.lvsazf.model.User;
import com.lvsazf.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private CodeMapper mapper;
	
	@Override
	public User findByUserId(String id) {
		Code code = mapper.selectByPrimaryKey(id);
		System.out.println(code);
		return null;
	}

}
