package com.demo.jdk;

public interface Greeting {
    //Spring can use two Proxy
    //  1 <---  Jdk Dynamic proxy
    String greet(String name);
}
