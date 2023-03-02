package com.demo.beans;

import org.springframework.stereotype.Component;

@Component

public class SpringBean2 implements MyInterface {
    public SpringBean2() {
        System.out.println("Spring Bean Two");
    }

    @Override
    public int getOrder() {
        return 2;
    }

    public String toString() {
        return "Spring Bean Two";
    }


}
