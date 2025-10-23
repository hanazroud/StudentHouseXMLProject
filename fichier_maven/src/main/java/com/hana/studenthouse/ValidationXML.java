package com.hana.studenthouse;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class ValidationXML {
    public static void main(String[] args) {
        try {
            String xsdPath = "src/main/resources/student_house.xsd";
            String xmlPath = "src/main/resources/student_house.xml";

            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Validator validator = factory.newSchema(new File(xsdPath)).newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));

            System.out.println("XML valide ✅");
        } catch (Exception e) {
            System.out.println("Erreur de validation ❌");
            e.printStackTrace();
        }
    }
}
