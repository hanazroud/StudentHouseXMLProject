package com.hana.studenthouse;

public class StudentHouseApp {
    public static void main(String[] args) {
        ValidationXML.main(args); // Valide le XML
        System.out.println("\n--- Résultats XPath ---\n");
        try {
            XPathQuery.main(args); // Exécute les requêtes XPath
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
