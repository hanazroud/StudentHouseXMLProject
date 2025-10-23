package com.hana.studenthouse;

import javax.xml.xpath.*;
import org.w3c.dom.*;
import javax.xml.parsers.*;

public class XPathQuery {
    public static void main(String[] args) throws Exception {
        String xmlPath = "src/main/resources/student_house.xml";

        Document doc = DocumentBuilderFactory.newInstance()
                .newDocumentBuilder()
                .parse(xmlPath);

        XPath xpath = XPathFactory.newInstance().newXPath();

        // Tous les noms des étudiants
        XPathExpression expr = xpath.compile("//etudiant/@nom");
        NodeList nodes = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);
        System.out.println("Liste des étudiants :");
        for (int i = 0; i < nodes.getLength(); i++) {
            System.out.println("- " + nodes.item(i).getNodeValue());
        }

        // Chambres disponibles
        XPathExpression expr2 = xpath.compile("//chambre[@disponible='oui']/@numero");
        NodeList nodes2 = (NodeList) expr2.evaluate(doc, XPathConstants.NODESET);
        System.out.println("Chambres disponibles :");
        for (int i = 0; i < nodes2.getLength(); i++) {
            System.out.println("- " + nodes2.item(i).getNodeValue());
        }
    }
}
