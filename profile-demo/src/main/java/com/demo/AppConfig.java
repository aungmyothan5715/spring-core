package com.demo;

import com.demo.repository.DbReportRepository;
import com.demo.repository.FileReportRepository;
import com.demo.repository.ReportRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@ComponentScan
@Configuration
public class AppConfig {

    @Bean
    @Profile("file")
    public ReportRepository fileReportRepository() {
        return new FileReportRepository();
    }

    @Bean
    @Profile("db")
    public ReportRepository dbReportRepository() {
        return new DbReportRepository();
    }

    public ReportRepository fileReportPrinter() {
        return new FileReportPrinter();
    }
}
