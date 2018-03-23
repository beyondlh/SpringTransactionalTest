package com.lh.dao;

import com.lh.domain.User;

public interface UserDao {
	
	/**
	 * @param userId
	 * @return User
	 */
	public User selectUserById(Integer userId);  
	
	public void addUser(User user);

}
