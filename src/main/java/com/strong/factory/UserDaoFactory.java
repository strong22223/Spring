package com.strong.factory;

import com.strong.dao.UserDao;
import com.strong.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    //普通创建实例化对象的工厂
    public UserDao getUserDao() {
//        在实例化Bean的时间 加入拥有必要的步骤,则需要在这里写到
        return new UserDaoImpl();
    }
}
