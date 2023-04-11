package com.dominikcebula.edu.design.patterns.behavioral.template.method.report;

public class HtmlReportGenerator extends ReportGenerator {
    @Override
    void createHeader() {
        System.out.println("Creating Html Header");
    }

    @Override
    void createBody() {
        System.out.println("Creating Html Body");
    }

    @Override
    void createFooter() {
        System.out.println("Creating Html Footer");
    }
}
