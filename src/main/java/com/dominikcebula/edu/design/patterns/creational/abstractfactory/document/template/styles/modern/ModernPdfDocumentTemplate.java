package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.modern;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;

class ModernPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Modern Style Pdf Document.");
    }
}
