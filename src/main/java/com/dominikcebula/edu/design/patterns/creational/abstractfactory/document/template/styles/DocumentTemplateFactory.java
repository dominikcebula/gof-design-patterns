package com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.HtmlDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PPTDocumentTemplate;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.formats.PdfDocumentTemplate;

public interface DocumentTemplateFactory {
    HtmlDocumentTemplate createHtmlDocumentTemplate();

    PdfDocumentTemplate createPdfDocumentTemplate();

    PPTDocumentTemplate createPPTDocumentTemplate();
}
