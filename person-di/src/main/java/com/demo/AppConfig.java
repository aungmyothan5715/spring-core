package com.demo;

import com.demo.beans.Address;
import com.demo.beans.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {




    /*
    //Java base explicit dependency injection
    @Bean
    public Person person() {
        Person person = new Person();
        person.setAddress(address()); // this called method
        return person;
    }

     */

    /*
    // Java base implicit dependency injection
    @Bean
    @Autowired
    public Person person(Address address) {
        Person person = new Person();
        person.setAddress(address); // this called address object
        return person;
    }

    */


    public Address address() {
        return new Address();
    }
}
