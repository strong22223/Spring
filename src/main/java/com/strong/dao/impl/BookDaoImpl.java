package com.strong.dao.impl;


import com.strong.dao.BookDao;


public class BookDaoImpl implements BookDao {


    @Override
    public int save() {
        System.out.println("This is BookDao" );
        return 0;
    }
}
