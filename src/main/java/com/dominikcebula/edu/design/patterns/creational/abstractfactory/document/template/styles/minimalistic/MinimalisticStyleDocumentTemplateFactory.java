package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.minimalistic;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.DocumentTemplateFactory;

public class MinimalisticStyleDocumentTemplateFactory implements DocumentTemplateFactory {
    @Override
    public HtmlDocumentTemplate createHtmlDocumentTemplate() {
        return new MinimalisticHtmlDocumentTemplate();
    }

    @Override
    public PdfDocumentTemplate createPdfDocumentTemplate() {
        return new MinimalisticPdfDocumentTemplate();
    }

    @Override
    public PPTDocumentTemplate createPPTDocumentTemplate() {
        return new MinimalisticPPTDocumentTemplate();
    }
}
