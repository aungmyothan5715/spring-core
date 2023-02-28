package com.demo.beans.sub;

import org.springframework.stereotype.Component;

@Component
public class A {
    public A() {
        System.out.println(this.getClass().getSimpleName() + "::Constructor...");
    }
}
