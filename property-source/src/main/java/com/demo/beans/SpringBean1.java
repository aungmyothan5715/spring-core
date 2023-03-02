package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class SpringBean1 {
    @Value("${app.invoice}")
    private int invoice;

    @Value("${app.name}")
    private String name;

    @Value("${app.vm.name}")
    private  String vm;

    @Value("${JAVA_HOME}")
    private String javaHome;

    @Value("${user.name}")
    private String userName;

    @Value("${OS.namme}")
    private String osName;

    public  void  print() {
        System.out.println("Invoice:" + invoice);
        System.out.println("App Name: " + name);
        System.out.println("VM Properties:" + vm);
        System.out.println("Java home :" + javaHome);
        System.out.println("User Name :" + userName);
        System.out.println("OS Name : " + osName);
    }
}
