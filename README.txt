# Projet StudentHouse – Gestion de logements étudiants

## 1. Objectif
Le projet StudentHouse a pour objectif de gérer des logements étudiants en utilisant XML, XSD et Java.
Les fonctionnalités principales sont :
- Validation d’un fichier XML avec un schéma XSD
- Interrogation du XML avec XPath pour extraire des informations

---

## 2. Structure du XML
Le fichier `student_house.xml` contient les entités principales :

- **residences_etudiantes**
  - **residence** : id, nom, localisation
    - **chambre** : numero, type, prix, disponible
    - **etudiant** : id, nom, prenom, age, genre, chambre_ref
      - **paiement** : mois, montant, statut

Exemple d’extraction :
- Liste des étudiants : `//etudiant/@nom`
- Chambres disponibles : `//chambre[@disponible='oui']/@numero`

---

## 3. Schéma XSD
Le fichier `student_house.xsd` définit :
- Les éléments et attributs obligatoires
- Les types de données (string, int, float, etc.)
- Les règles de validation (ex. : chambre doit avoir un numéro et un type)

---

## 4. Classes Java
- **ValidationXML.java** : valide le XML avec le XSD
- **XPathQuery.java** : exécute des requêtes XPath sur le XML
- **StudentHouseApp.java** (optionnel) : combine validation et requêtes XPath

---

## 5. Instructions pour exécuter
1. Importer le projet Maven dans IntelliJ
2. Vérifier que le `pom.xml` contient les dépendances :
   - `jaxp-api` pour la validation XML/XSD
   - `jaxen` pour XPath
3. Exécuter `ValidationXML.java` pour vérifier la validité du XML
4. Exécuter `XPathQuery.java` pour obtenir la liste des étudiants et des chambres disponibles
5. (Optionnel) Exécuter `StudentHouseApp.java` pour tout exécuter en une seule fois

---

## 6. Organisation du projet
