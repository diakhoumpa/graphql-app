# Projet Spring Boot avec GraphQL

Ce projet est un exemple de mise en œuvre d'une API GraphQL avec Spring Boot, utilisant les dépendances suivantes :

- Spring Web : Pour la mise en place d'une application web.
- Spring Data JPA : Pour l'intégration avec la couche d'accès aux données.
- Lombok : Pour la réduction du code boilerplate en Java.
- H2 Database : Pour une base de données en mémoire pour le développement et les tests.
- Spring GraphQL : Pour la prise en charge de GraphQL dans une application Spring Boot.

## Prérequis

Avant de commencer, assurez-vous d'avoir installé les éléments suivants :

- Java JDK
- Maven
- Un IDE Java (comme IntelliJ IDEA ou Eclipse)


## Utilisation

Une fois que l'application est en cours d'exécution, vous pouvez accéder à l'interface graphique de GraphQL via l'URL `http://localhost:8080/graphiql`.

Voici quelques requêtes GraphQL d'exemple :

```graphql
query {
  getStudents {
    id
    name
    email
    phone
  }
}

query {
  getStudent(id: 1) {
    id
    name
    email
    phone
  }
}

query {
    getStudentByName(name: "ou") {
        id,name
    }
}

mutation {
  createStudent(studentDto: {
    name: "Marieme Diakhoumpa"
    email: "diakhoumpa@gmail.com"
    phone: "777767890"
  }) {
    id
    name
    email
    phone
  }
}
```
