package com.lvsazf.service;

import com.lvsazf.model.User;

public interface UserService {

	User findByUserId(String id);
	
}
