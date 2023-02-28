package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name;

    public Person() {
        System.out.println("Person Constructor:: Address::" + address);
    }

    @PostConstruct
    public  void init() {
        //
        System.out.println("PostConstruct:: Address::" + address.getClass().getSimpleName());
    }


    //@Autowired can use on Constructor | setAddress() | private Address address.
    //@Autowired // Field injection
    private Address address;  // <bean id="person" class="com.demo.beans.Person" autowire="byName"> //byName will search address in class="com.demo.beans.Person" class
    // autowire -> byType | byName | constructor
    //byType will search Address type.
    //constructor will search constructor in class="com.demo.beans.Person" (Person class)


    @Autowired // constructor injection
    public Person(Address address) {
        this.address = address;

        //<constructor-arg name="address" ref="address"/> //for beans.xml
    }

    /*
    // This is @Autowired phyit tal

    private final Address address; // it can work only in constructor
     public Person(Address address) {
        this.address = address;
     }
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
 //    <property name="address" ref="address"/> from beans.xml



    public String personInfo() {
        return this.name + " " + this.address.getStreetName();
    }
}
