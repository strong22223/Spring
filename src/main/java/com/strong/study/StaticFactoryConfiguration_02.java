package com.strong.study;

import com.strong.dao.OrderDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StaticFactoryConfiguration_02 {

    public static void main(String[] args) {
/**
 *   1.自定义静态工厂实现实例化
 *         OrderDao orderDaoImpl = OrderDaoFactory.getOrderDaoImpl();
 *         orderDaoImpl.save();
 *       2.在实例化的时间必须将工厂交给Spring管理
 *         通过工厂的方法来获取
 *         配置的时间,必须是class是共产类的全路径
 */

        ApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        OrderDao orderDao = ctx.getBean("orderDao", OrderDao.class);
        orderDao.save();


    }
}
