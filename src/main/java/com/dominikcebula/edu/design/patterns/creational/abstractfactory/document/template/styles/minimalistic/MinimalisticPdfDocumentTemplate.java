package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.minimalistic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;

class MinimalisticPdfDocumentTemplate implements PdfDocumentTemplate {
    @Override
    public void renderPdf() {
        System.out.println("Rendering Minimalistic Style Pdf Document.");
    }
}
