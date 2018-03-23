package com.lh.service;

import com.lh.domain.User;

public interface UserService {
	User selectUserById(Integer userId);  
	void addUser(User user) throws RuntimeException;
}
