package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bean2")
public class SpringBean2 {
    @Value("Reading")
    public String hobby;

    //public String hobby = "Hello Hobby"; // If you use this way, you don't need to use @Value("Reading")
}
