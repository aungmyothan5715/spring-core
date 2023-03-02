package com.demo;

import com.demo.beans.SpringBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.support.DefaultConversionService;

@PropertySource("classpath:/application.properties")
@ComponentScan
@Configuration
public class AppConfig {
    @Bean
    public ConversionService conversionService() {
        return new DefaultConversionService();
    }






}
