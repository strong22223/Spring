package com.strong.study;

import com.strong.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoBeanByType_ByName {


    public static void main(String[] args) {

        /**
         * 1. 自动装配用于引用类型依赖注入，不能对简单类型进行操作
         * 2. 使用按类型装配时（byType）必须保障容器中相同类型的bean唯一，推荐使用
         * 3. 使用按名称装配时（byName）必须保障容器中具有指定名称的bean，因变量名与配置耦合，不推荐使用
         * 4. 自动装配优先级低于setter注入与构造器注入，同时出现时自动装配配置失效
         */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        BookService bean = (BookService) applicationContext.getBean("bookService");
        bean.save();
    }
}
