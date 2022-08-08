package com.strong.factory;

import com.strong.dao.UserDao;
import com.strong.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserBeanFactoryBean implements FactoryBean {
    @Override
    public Object getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    /**
     * 与scope的作用是相同的 控制是否为单例Bean
     *
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
