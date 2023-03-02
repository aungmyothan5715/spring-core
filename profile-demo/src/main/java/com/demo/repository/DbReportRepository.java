package com.demo.repository;

public class DbReportRepository implements ReportRepository{
    @Override
    public Report save(Report report) {

        System.out.println("DbReportRepository::save() invoked");
        return report;
    }
}
