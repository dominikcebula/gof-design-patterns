package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.classic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.DocumentTemplateFactory;

public class ClassicStyleDocumentTemplateFactory implements DocumentTemplateFactory {
    @Override
    public HtmlDocumentTemplate createHtmlDocumentTemplate() {
        return new ClassicHtmlDocumentTemplate();
    }

    @Override
    public PdfDocumentTemplate createPdfDocumentTemplate() {
        return new ClassicPdfDocumentTemplate();
    }

    @Override
    public PPTDocumentTemplate createPPTDocumentTemplate() {
        return new ClassicPPTDocumentTemplate();
    }
}
