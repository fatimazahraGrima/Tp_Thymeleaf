# Application CRUD avec Spring Boot et Thymeleaf

Ce projet est une application web CRUD simple construite avec Spring Boot et Thymeleaf. Elle permet de gérer des utilisateurs dans une base de données MySQL. Les opérations CRUD (Créer, Lire, Mettre à jour, Supprimer) sont implémentées en utilisant Spring Data JPA pour simplifier l'accès aux données.

## Table des Matières

- [Fonctionnalités](#fonctionnalités)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Structure du Projet](#structure-du-projet)
- [Utilisation](#utilisation)
- [Dépendances](#dépendances)
- [Licence](#licence)

## Fonctionnalités

- **Créer** un nouvel utilisateur avec des informations de nom et d'email.
- **Afficher** la liste des utilisateurs enregistrés.
- **Mettre à jour** les informations d'un utilisateur.
- **Supprimer** un utilisateur de la base de données.

## Prérequis

- **Java JDK 21**
- **Maven** pour la gestion des dépendances
- **MySQL** pour la base de données

## Installation

1. **Pom.xml :**

    ```bash
    git clone https://github.com/votre-utilisateur/votre-projet.git
    cd votre-projet
    ```

2. **Configurer la base de données MySQL :**
    - Créez une base de données nommée `thymeleaf` dans MySQL.
    - Mettez à jour le fichier `src/main/resources/application.properties` avec vos informations de connexion MySQL.

![image](https://github.com/user-attachments/assets/590c9f49-d707-4a23-90d2-3a456713733b)

3. **Exécuter l'application :**

    Utilisez Maven pour compiler et démarrer l'application :

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

4. **Accéder à l'application :**

    Ouvrez votre navigateur et accédez à `http://localhost:8080`.

## Structure du Projet

- **`User`** : classe entité représentant un utilisateur, avec des attributs `id`, `name`, et `email`.

  ![image](https://github.com/user-attachments/assets/c0506346-e9b7-4044-bd71-4eefec643fda)

- **`UserRepository`** : interface étendant `CrudRepository` pour fournir des fonctionnalités CRUD sur `User`.

  ![image](https://github.com/user-attachments/assets/debd9fbe-3e82-432c-b5e2-e95c03ddb488)

- **`UserController`** : contrôleur qui gère les requêtes HTTP pour les opérations CRUD et interagit avec le `UserRepository`.

![image](https://github.com/user-attachments/assets/aa060c6b-15f9-4ea9-a64d-128ca6f33e7b) ![image](https://github.com/user-attachments/assets/8dc4c183-49b5-4f5a-b016-36b9001ececc) ![image](https://github.com/user-attachments/assets/1ea61a1e-5533-4526-95a0-d07eb5a6eff6)



- **Templates Thymeleaf** :
  - `add-user.html` : formulaire pour ajouter un nouvel utilisateur.
![image](https://github.com/user-attachments/assets/f76b2547-f525-4d5a-ae1c-cff0d9173cc5)

  - `update-user.html` : formulaire pour mettre à jour les informations d'un utilisateur existant.
![image](https://github.com/user-attachments/assets/199cb3b5-35cd-4523-8728-23fba8c0b351)

  - `index.html` : vue principale pour afficher la liste des utilisateurs et leurs actions.
![image](https://github.com/user-attachments/assets/3c9c50db-d3f7-4d8c-ac24-59035a5b1d95)


## Utilisation

### Ajouter un Utilisateur

1. Accédez à `http://localhost:8080/signup`.
2. Remplissez le formulaire avec le nom et l'email de l'utilisateur.
3. Cliquez sur "Add User" pour enregistrer les informations dans la base de données.

### Modifier un Utilisateur

1. Sur la page principale (`http://localhost:8080`), cliquez sur "edit" à côté de l'utilisateur à modifier.
2. Mettez à jour les informations et cliquez sur "Update User".

### Supprimer un Utilisateur

1. Sur la page principale, cliquez sur "delete" à côté de l'utilisateur à supprimer.

## Dépendances

Les principales dépendances Maven sont :

- **spring-boot-starter-web** : pour créer des applications web.
- **spring-boot-starter-data-jpa** : pour l'interaction avec la base de données MySQL via JPA.
- **spring-boot-starter-thymeleaf** : pour utiliser Thymeleaf comme moteur de templates.
- **mysql-connector-java** : pour connecter l'application à une base de données MySQL.
- **spring-boot-devtools** : pour recharger automatiquement l'application pendant le développement.

## Licence

Ce projet est sous licence MIT. Veuillez consulter le fichier `LICENSE` pour plus de détails.

