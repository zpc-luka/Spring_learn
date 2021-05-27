package com.zpc.service;

import com.zpc.dao.UserDao;
import com.zpc.dao.UserDaoImpl;

public class UserServiceImp implements UserService{

    private UserDao userDao;

    //利用set实现动态值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
