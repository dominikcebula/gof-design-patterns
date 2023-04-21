package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.classic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;

class ClassicHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Classic Style HTML Document.");
    }
}
