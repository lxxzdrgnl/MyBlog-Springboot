# Spring Boot Blog Project

This project is a personal blog application built by following the book **“Becoming a Spring Boot 3 Developer”**. It provides practical experience with Spring Boot 3, JPA, and Thymeleaf by implementing essential features for a blog platform.

## Features

* CRUD operations for blog articles
* RESTful API endpoints
* Web UI with Thymeleaf
* Article list, view, create, edit, delete
* Database integration with Spring Data JPA
* Entity auditing (`@CreatedDate`, `@LastModifiedDate`)

## Tech Stack

* **Backend**: Spring Boot 3, Spring MVC, Spring Data JPA
* **Frontend**: Thymeleaf, Bootstrap
* **Database**: MySQL (or H2 for development)
* **Build Tool**: Gradle

## Folder Structure

```
src
├── main
│   ├── java
│   │   └── me.lxxzdrgnl.springbootdeveloper
│   │       ├── controller      # Controllers
│   │       ├── domain          # JPA entities
│   │       ├── dto             # Data Transfer Objects
│   │       └── service         # Business logic
│   └── resources
│       ├── static              # CSS, JS
│       ├── templates           # Thymeleaf templates
│       └── application.yml     # Config
```
