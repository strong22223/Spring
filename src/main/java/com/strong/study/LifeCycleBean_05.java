package com.strong.study;

import com.strong.service.impl.LifeCycleBeanImpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleBean_05 {
    public static void main(String[] args) {
        /**         Bean的生命周期
         *              *配置init-method方法
         *              *配置destroy-method方法
         *                  #设置JVM狗子函数 registerShutdownHook()
         *                  #close()方法
         *        1. 在配置文件中的bean标签中添加`init-method`和`destroy-method`属性
         *        2. 类实现`InitializingBean`与`DisposableBean`接口，这种方式了解下即可。
         *
         * (2)对于bean的生命周期控制在bean的整个生命周期中所处的位置如下:
         *
         * * **初始化容器**
         *   * **1.创建对象(内存分配)**
         *   * **2.执行构造方法**
         *   * **3.执行属性注入(set操作)**
         *   * **==4.执行bean初始化方法==**
         * * **使用bean**
         *   * **1.执行业务操作**
         * * **关闭/销毁容器**
         *   * **==1.执行bean销毁方法==**
         *
         *
         */
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("application.xml");
        LifeCycleBeanImpl lifeCycle = ctx.getBean("lifeCycle", LifeCycleBeanImpl.class);
//        LifeCycleBean lifeCycle = ctx.getBean("lifeCycle", LifeCycleBean.class);
        lifeCycle.save();
        ctx.close();
    }

}
