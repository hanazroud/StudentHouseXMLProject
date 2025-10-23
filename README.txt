# Projet TP – Gestion d’un système de location de vélos

## 1. Objectif du projet
Ce projet consiste à créer un système de gestion de vélos en XML.
- Stocker les informations sur les vélos disponibles
- Gérer les clients
- Enregistrer les locations

## 2. Structure des fichiers
- bike.xml  : fichier XML contenant les données
- bike.xsd  : fichier XSD définissant les règles et les types de données
- README.txt : ce fichier d’explication

## 3. Description des entités

### a) Bikes (vélos)
- id : identifiant unique du vélo
- ref : référence optionnelle
- marque, modele, type, prix, disponibilite : informations sur le vélo

### b) Clients
- id : identifiant unique du client
- ref : référence optionnelle
- nom, prenom, email, telephone : informations personnelles

### c) Locations
- id : identifiant unique de la location
- bike_ref : référence du vélo loué
- client_ref : référence du client
- date_debut, date_fin : période de location
- prix_total : coût total de la location

## 4. Validation
- Le fichier bike.xml est lié au fichier bike.xsd pour vérifier :
  - La présence de tous les éléments requis
  - Le type de données (string, decimal, date)
  - Les identifiants uniques
- Validation effectuée dans IntelliJ → "No errors found"

## 5. Instructions
1. Ouvrir le projet dans IntelliJ
2. Vérifier que bike.xml et bike.xsd sont dans le même dossier
3. Cliquer droit sur bike.xml → Validate pour tester la conformité

## 6. Remarques
- Ce projet peut être étendu pour ajouter plus de vélos, clients et locations
- Les références (`bike_ref`, `client_ref`) permettent de relier les vélos aux clients
