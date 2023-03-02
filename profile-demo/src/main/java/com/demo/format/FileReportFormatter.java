package com.demo.format;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("file")
public class FileReportFormatter implements ReportFormatter {
    @Override
    public Report format(Report report) {
        System.out.println("File format formatter save():: invoked");
        return report;
    }
}
