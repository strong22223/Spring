package com.strong.dao.impl;


import com.strong.dao.BookDao;
import com.strong.dao.UserDao;


public class UserDaoImpl implements UserDao {


    @Override
    public int save() {
        System.out.println("This is UserDao..." );
        return 0;
    }
}
