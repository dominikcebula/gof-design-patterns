package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.modern;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;

class ModernHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Modern Style HTML Document.");
    }
}
