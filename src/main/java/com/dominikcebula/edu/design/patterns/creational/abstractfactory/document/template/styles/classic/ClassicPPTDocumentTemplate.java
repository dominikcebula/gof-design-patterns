package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.classic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;

class ClassicPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Classic Style PPT Document.");
    }
}
