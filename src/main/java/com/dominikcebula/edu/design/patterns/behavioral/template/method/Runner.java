package com.dominikcebula.edu.design.patterns.behavioral.template.method;

import com.dominikcebula.edu.design.patterns.behavioral.template.method.report.HtmlReportGenerator;
import com.dominikcebula.edu.design.patterns.behavioral.template.method.report.PdfReportGenerator;
import com.dominikcebula.edu.design.patterns.behavioral.template.method.report.ReportGenerator;
import com.dominikcebula.edu.design.patterns.behavioral.template.method.report.TxtReportGenerator;

class Runner {
    public static void main(String[] args) {
        ReportGenerator htmlReportGenerator = new HtmlReportGenerator();
        htmlReportGenerator.generateReport();

        ReportGenerator pdfReportGenerator = new PdfReportGenerator();
        pdfReportGenerator.generateReport();

        ReportGenerator txtReportGenerator = new TxtReportGenerator();
        txtReportGenerator.generateReport();
    }
}
