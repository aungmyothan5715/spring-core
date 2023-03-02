package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    //prototype bean can not change from eager to lazy.
    //singleton bean can change from lazy to eager.


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();
        SpringBean1 sb1 = context.getBean(SpringBean1.class);
        sb1.print();
    }
}
