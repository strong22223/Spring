package com.strong.dao.impl;

import com.strong.dao.OrderDao;

public class OrderDaoImpl implements OrderDao {

    @Override
    public int save() {
        System.out.println("This is OrderDao...");

        return 0;
    }
}
