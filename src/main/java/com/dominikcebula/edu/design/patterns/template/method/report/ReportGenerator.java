package com.dominikcebula.edu.design.patterns.template.method.report;

public abstract class ReportGenerator {
    public void generateReport() {
        openReport();
        createHeader();
        createBody();
        createFooter();
        closeReport();
    }

    private void openReport() {
        System.out.println("Opening report");
    }

    abstract void createHeader();

    abstract void createBody();

    abstract void createFooter();

    private void closeReport() {
        System.out.println("Closing report");
    }
}
