package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.classic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;

class ClassicPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Classic Style Pdf Document.");
    }
}
