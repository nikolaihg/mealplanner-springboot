# mealplanner-springboot

A simple Java Spring Boot backend for planning weekly dinners. Built with RESTful principles and a focus on clean architecture, authentication, and good architecture.

## Planned Features

- Basic user authentication (done via Spring Security)
- JWT-based auth system (with registration/login)
- PostgreSQL integration
- REST endpoints for:
    - Meals
    - Weekly menus
    - Users (real user model)
- Docker

## Technologies
- Java 21
    - Spring Boot
    - Spring Security
    - Maven
    - JWT
    - dotenv-java
- PostgreSQL
- Docker

## Getting started

### Enviroment

Create a `.env` file in the project root:

Copy the `.env.example` file in the project root:
```bash
cp .env.example .env
```

Edit the .env file and replace the placeholders with the appropriate credentials. 

```env
DB_USER=your_postgres_user
DB_PASSWORD=your_postgres_password
```

### Run the App
```bash
./mvnw spring-boot:run
````

Visit: [http://localhost:8080](http://localhost:8080)