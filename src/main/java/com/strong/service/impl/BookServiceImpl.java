package com.strong.service.impl;

import com.strong.dao.BookDao;
import com.strong.dao.impl.BookDaoImpl;
import com.strong.service.BookService;

public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    @Override
    public void save() {
        bookDao.save();
        System.out.println("This is BookService");
    }

    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}
