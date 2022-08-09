package com.strong.study;

import com.strong.service.impl.LifeCycleBeanImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DiParameter_05 {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        LifeCycleBeanImpl lifeCycle = ctx.getBean("lifeCycle", LifeCycleBeanImpl.class);
//        LifeCycleBean lifeCycle = ctx.getBean("lifeCycle", LifeCycleBean.class);
        lifeCycle.save();
        ctx.close();
    }

}
