package com.demo.format;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("db")
public class DbReportFormatter implements ReportFormatter {
    @Override
    public Report format(Report report) {
        System.out.println("Db report formatter save()::invoked");
        return report;
    }
}
