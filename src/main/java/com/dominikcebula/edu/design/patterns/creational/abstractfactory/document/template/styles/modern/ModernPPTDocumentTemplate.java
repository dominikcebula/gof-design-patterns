package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.modern;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;

class ModernPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Modern Style PPT Document.");
    }
}
