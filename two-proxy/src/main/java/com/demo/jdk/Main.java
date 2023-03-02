package com.demo.jdk;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new VerboseGreetingProxy(new FormatGreetingTarget());
        System.out.println(greeting.greet(" John"));
    }
}
