package com.strong.factory;

import com.strong.dao.OrderDao;
import com.strong.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {

    public static OrderDao getOrderDaoImpl() {
//        在实例化Bean的时间 加入拥有必要的步骤,则需要在这里写到
        return new OrderDaoImpl();
    }
}
