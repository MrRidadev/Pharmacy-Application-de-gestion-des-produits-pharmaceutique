# 🏥 Pharmacy Product Management API

Une API REST développée avec **Spring Boot** pour gérer efficacement les produits d'une pharmacie : ajout, modification, suppression et consultation.



## 📌 Objectif du projet

Dans le cadre de l'ouverture d'une nouvelle pharmacie, ce projet vise à automatiser la gestion des produits en stock afin d'améliorer le suivi de l'inventaire, réduire les erreurs humaines et gagner du temps dans la recherche des articles.



## 🔧 Technologies utilisées

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (ou PostgreSQL)
- Postman (tests d’API)



## 📦 Fonctionnalités

- 🔹 **Ajouter** un produit
- 🔹 **Modifier** un produit existant
- 🔹 **Supprimer** un produit
- 🔹 **Consulter** la liste complète des produits



## 🗃️ Structure de l'entité `Produit`

| Champ         | Type     | Description                          |
|---------------|----------|--------------------------------------|
| id            | Long     | Identifiant auto-généré              |
| nom           | String   | Nom du produit                       |
| quantite      | Integer  | Quantité disponible en stock         |
| prix          | Double   | Prix unitaire                        |
| description   | String   | Brève description du produit         |



## 🔌 Endpoints REST

| Méthode | Endpoint              | Description                       |
|---------|-----------------------|-----------------------------------|
| POST    | `/api/produits`       | Ajouter un nouveau produit        |
| GET     | `/api/produits`       | Lister tous les produits          |
| GET     | `/api/produits/{id}`  | Obtenir un produit par ID         |
| PUT     | `/api/produits/{id}`  | Modifier un produit existant      |
| DELETE  | `/api/produits/{id}`  | Supprimer un produit par ID       |



## ⚙️ Installation

### 1. Cloner le projet

```bash
git clone https://github.com/MrRidadev/Pharmacy-Application-de-gestion-des-produits-pharmaceutique.git
cd PharmacyAppliquation
