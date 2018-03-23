package com.lh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lh.dao.UserDao;
import com.lh.domain.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public User selectUserById(Integer userId) {
        return userDao.selectUserById(userId);
    }

    /*http://www.importnew.com/19489.html#comment-495073参考学习*/
//    @Transactional(propagation = Propagation.REQUIRED)
    @Transactional
    public void addUser(User user) throws Exception {
        userDao.addUser(user);
//        Exception，数据可以正常插入,抛出RuntimeException,事务生效
//        throw new RuntimeException("00");
    }
}
