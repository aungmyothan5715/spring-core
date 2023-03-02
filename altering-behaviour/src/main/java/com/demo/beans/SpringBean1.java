package com.demo.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean1 {
    public SpringBean1() {
        System.out.println(this.getClass().getSimpleName());
    }
}
