package com.dominikcebula.edu.design.patterns.creational.abstractfactory;

import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.DocumentTemplatesGenerator;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.classic.ClassicStyleDocumentTemplateFactory;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.minimalistic.MinimalisticStyleDocumentTemplateFactory;
import com.dominikcebula.edu.design.patterns.creational.abstractfactory.document.template.styles.modern.ModernStyleDocumentTemplateFactory;

public class Runner {
    public static void main(String[] args) {
        var classicStyleFactory = new ClassicStyleDocumentTemplateFactory();
        var classicTemplatesGenerator = new DocumentTemplatesGenerator(classicStyleFactory);
        classicTemplatesGenerator.renderTemplates();

        var minimalisticStyleFactory = new MinimalisticStyleDocumentTemplateFactory();
        var minimalisticTemplatesGenerator = new DocumentTemplatesGenerator(minimalisticStyleFactory);
        minimalisticTemplatesGenerator.renderTemplates();

        var modernStyleFactory = new ModernStyleDocumentTemplateFactory();
        var modernTemplatesGenerator = new DocumentTemplatesGenerator(modernStyleFactory);
        modernTemplatesGenerator.renderTemplates();
    }
}
