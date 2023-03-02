package com.demo.repository;

public class FileReportRepository implements ReportRepository{
    @Override
    public Report save(Report report) {
        System.out.println("FileReportRepository::save() invoked");
        return report;
    }
}
