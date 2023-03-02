package com.demo.printer;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("db")
public class DbReportPrinter implements ReportPrinter {
    @Override
    public void print(Report report) {
        System.out.println("Db report formatter save():: ");
    }
}
