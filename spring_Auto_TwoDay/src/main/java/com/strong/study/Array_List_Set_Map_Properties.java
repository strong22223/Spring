package com.strong.study;

import com.strong.dao.OrderDao;
import com.strong.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Array_List_Set_Map_Properties {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        OrderDao bean = (OrderDao) applicationContext.getBean("orderDao");
        bean.save();
    }
}
