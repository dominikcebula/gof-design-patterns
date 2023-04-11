package com.dominikcebula.edu.design.patterns.behavioral.template.method.report;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    void createHeader() {
        System.out.println("Creating Pdf Header");
    }

    @Override
    void createBody() {
        System.out.println("Creating Pdf Body");
    }

    @Override
    void createFooter() {
        System.out.println("Creating Pdf Footer");
    }
}
