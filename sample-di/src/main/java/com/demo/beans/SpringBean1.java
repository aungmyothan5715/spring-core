package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
//@Order(3)
public class SpringBean1 implements MyInterface, Ordered {
    public SpringBean1() {
        System.out.println("Spring Bean one");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
