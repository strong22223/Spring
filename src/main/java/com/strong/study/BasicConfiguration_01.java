package com.strong.study;

import com.strong.dao.BookDao;
import com.strong.dao.impl.BookDaoImpl;
import com.strong.service.impl.BookServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BasicConfiguration_01 {

    public static void main(String[] args) {
        ApplicationContext ctx= new ClassPathXmlApplicationContext("application.xml");
//
//        BookServiceImpl bookService = ctx.getBean("bookService",BookServiceImpl.class);
//
//        bookService.save();
        BookDao dao1 = ctx.getBean("bookDao", BookDao.class);
        BookDao dao2 = ctx.getBean("bookDao", BookDao.class);

        System.out.println(dao1);
        System.out.println(dao2);

    }
}
