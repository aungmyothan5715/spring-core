package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class SpringBean2 {
    @Autowired
    public SpringBean2() {
        System.out.println(this.getClass().getSimpleName());
    }
}
