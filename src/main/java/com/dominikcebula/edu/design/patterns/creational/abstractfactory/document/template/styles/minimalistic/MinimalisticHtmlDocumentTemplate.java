package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.minimalistic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;

class MinimalisticHtmlDocumentTemplate implements HtmlDocumentTemplate {
    @Override
    public void renderHtml() {
        System.out.println("Rendering Minimalistic Style HTML Document.");
    }
}
