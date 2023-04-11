package com.dominikcebula.edu.design.patterns.behavioral.template.method.report;

public class TxtReportGenerator extends ReportGenerator {
    @Override
    void createHeader() {
        System.out.println("Creating Txt Header");
    }

    @Override
    void createBody() {
        System.out.println("Creating Txt Body");
    }

    @Override
    void createFooter() {
        System.out.println("Creating Txt Footer");
    }
}
