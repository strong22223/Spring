package com.strong.dao.impl;

import com.strong.dao.OrderDao;

import java.util.*;

public class OrderDaoImpl implements OrderDao {
    private int[] array;

    private List<String> list;

    public void setArray(int[] array) {
        this.array = array;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    private Set<String> set;

    private Map<String,String> map;

    private Properties properties;

    @Override
    public int save() {
        System.out.println("This is OrderDao...");


        System.out.println("遍历数组:" + Arrays.toString(array));

        System.out.println("遍历List" + list);

        System.out.println("遍历Set" + set);

        System.out.println("遍历Map" + map);

        System.out.println("遍历Properties" + properties);
        return 0;
    }
}
