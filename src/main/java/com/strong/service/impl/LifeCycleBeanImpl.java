package com.strong.service.impl;

import com.strong.dao.BookDao;
import com.strong.service.LifeCycleBean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LifeCycleBeanImpl implements LifeCycleBean, InitializingBean , DisposableBean {

    private BookDao bookDao;


    public void setBookDao(BookDao bookDao) {
        System.out.println("This is Set BookDao...");
        this.bookDao = bookDao;
    }

    public LifeCycleBeanImpl() {
        System.out.println("This is LifeCycle Construction...");
    }

    @Override
    public void save() {
        System.out.println("This is LifeCycleService...");
        bookDao.save();
    }

    @Override
    public void init() {
        System.out.println("This is LifeCycle init...");
    }

    @Override
    public void destroy() {
        System.out.println("This is LifeCycle destroy...");
    }

    /**
     * #第一种创建Bean的生命周期的方法
     * 自定义init方法,并且在配置文件中配置
     *
     * @Override public void init() {
     * System.out.println("This is LifeCycle init...");
     * }
     * @Override public void destroy() {
     * System.out.println("This is LifeCycle destroy...");
     * <p>
     * } *
     */


    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
