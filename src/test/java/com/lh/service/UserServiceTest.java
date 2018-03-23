package com.lh.service;

import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  
import com.lh.baseTest.SpringTestCase;
import com.lh.domain.User;

public class UserServiceTest extends SpringTestCase {
	
	@Autowired  
    private UserService userService; 
	
//	@Test  
//    public void selectUserByIdTest(){  
//        User user = userService.selectUserById(1);  
//        System.out.println(user.getUserName() + ":" + user.getUserPassword());
//    }  
	
	@Test  
    public void addUserTest() throws Exception{
		User user = new User();
		user.setUserName("lh2");
		user.setUserPassword("lh2");
        userService.addUser(user);
    }  
}
