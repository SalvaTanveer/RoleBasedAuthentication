# Role-Based Authentication System 🚀

A simple Spring Boot project implementing **role-based authentication** using **Spring Data JPA** and **MySQL**.

## 🔹 Features

- User authentication with role-based access (`Admin` & `Customer`).
- REST API for user login.
- Secure password validation.
- Tested using **Postman**.

## 🛠 Tech Stack

- **Backend:** Java, Spring Boot
- **Database:** MySQL
- **API Testing:** Postman

## 🚀 Getting Started

To set up and run the project, follow these steps:

## Clone the repository

```sh
git clone https://github.com/SalvaTanveer/RoleBasedAuthentication.git
cd RoleBasedAuthentication
```

## Configure MySQL database in application.properties

## (Open src/main/resources/application.properties and update)

```sh
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password
```

## Run the project

```sh
mvn spring-boot:run
```

## Test API using Postman (POST /api/user/login)

## Body (JSON)

```sh
{
  "name": "admin",
  "password": "admin123"
}
```

## Expected Response:

```sh
"WELCOME TO ADMIN DASHBOARD"
```
