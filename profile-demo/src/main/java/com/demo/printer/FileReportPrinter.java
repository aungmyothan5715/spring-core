package com.demo.printer;

public class FileReportPrinter implements ReportPrinter{
}


@Component @Profile("file")
public class FlieReportFormatter implements ReportPrinter{
    @Override
    public void print(Report report) {
        System.out.println("file report formatter print():: invoked");
    }
}