package com.strong.study;

import com.strong.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.config.ScheduledTask;

public class InstantiationFactory_FactoryBean_03 {

    public static void main(String[] args) {
/**
 *   1.自定义工厂实现实例化
 *         OrderDao orderDaoImpl = OrderDaoFactory.getOrderDaoImpl();
 *         orderDaoImpl.save();
 *       2.在实例化的时间必须将工厂交给Spring管理
 *         通过工厂的方法来获取
 *         配置的时间,必须是class是共产类的全路径
 *         ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
 *         UserDao userDao = ctx.getBean("userDao", UserDao.class);
 *         userDao.save();
 *
 *
 *   2. 实现FactoryBean工厂来 将Bean交给Spring来 管理
 *      * 1.实现FactoryBean接口, 重写getObject方法
 */

ApplicationContext ctx=new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao2");
        userDao2    .save()
;

    }
}
