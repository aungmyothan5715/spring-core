package com.demo.cglib;

public class Main {
    public static void main(String[] args) {
        MyGreeting greetingProxy = new GreetingProxy();
        System.out.println(greetingProxy.greet("Thomas"));
    }
}

/*
Eg code
public class AppConfig {} // If that class is final the proxy can not extend, so error
// Bean never be Final.
// @Bean(value="{p1, p2, p3}") // it can call p1 or p2 or p3
 */
