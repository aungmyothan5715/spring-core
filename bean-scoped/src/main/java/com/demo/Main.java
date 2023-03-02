package com.demo;

import com.demo.beans.SpringBean1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Two important scope are singleton and prototype
        //Prototype pattern can give clone ( clone() method ) that clone is not relationship it create new object.

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.registerShutdownHook();

        SpringBean1 sb1 = context.getBean(SpringBean1.class);
        SpringBean1 sb2 = context.getBean(SpringBean1.class);
        SpringBean1 sb3 = context.getBean(SpringBean1.class);
        SpringBean1 sb4 = context.getBean(SpringBean1.class);

        boolean test = sb1 == sb2;
        System.out.println("Spring Bean One and Spring Bean Two are the Same? " + test);

        System.out.println(SpringBean1.getCount());
    }
}
