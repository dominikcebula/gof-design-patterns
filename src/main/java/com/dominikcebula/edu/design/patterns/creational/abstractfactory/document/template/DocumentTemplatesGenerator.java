package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.DocumentTemplateFactory;

public class DocumentTemplatesGenerator {
    private final DocumentTemplateFactory documentTemplateFactory;

    public DocumentTemplatesGenerator(DocumentTemplateFactory documentTemplateFactory) {
        this.documentTemplateFactory = documentTemplateFactory;
    }

    public void renderTemplates() {
        HtmlDocumentTemplate htmlDocumentTemplate = documentTemplateFactory.createHtmlDocumentTemplate();
        PdfDocumentTemplate pdfDocumentTemplate = documentTemplateFactory.createPdfDocumentTemplate();
        PPTDocumentTemplate pptDocumentTemplate = documentTemplateFactory.createPPTDocumentTemplate();

        htmlDocumentTemplate.renderHtml();
        pdfDocumentTemplate.renderPdf();
        pptDocumentTemplate.renderPPT();
    }
}
