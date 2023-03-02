package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SpringBean1 {
    @Value("${app.name}")
    public String name;

    @Value("#{${invoice.amount} * 0.2}")
    private double invoiceDiscount;

    @Value("#{'Creek Bridge Road'.toUpperCase()}")
    private String streetName;

    @Value("#{bean2.hobby}")
    private String hobbyName;

    @Value("${app.fruits}")
    private String fruits;
   // private List<String> fruits; // If you use list the output is as array.

    @Value("#{${app.map}}")
    private Map<String, Integer> map;

    public String getStreetName() {
        return this.streetName;
    }
    public void print() {
        System.out.println("Name : " + name);
        System.out.println("Discount : " + invoiceDiscount);
        System.out.println("Street Name : " + streetName);
        System.out.println("Hobby Name : " + hobbyName);
        System.out.println("Fruits : " + fruits);

        System.out.println(map);

    }

}
