package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.minimalistic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;

class MinimalisticPPTDocumentTemplate implements PPTDocumentTemplate {
    @Override
    public void renderPPT() {
        System.out.println("Rendering Minimalistic Style PPT Document.");
    }
}
