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

```sh
# Clone the repository
git clone https://github.com/yourusername/role-based-authentication.git
cd role-based-authentication

# Configure MySQL database in application.properties
# (Open src/main/resources/application.properties and update)
spring.datasource.url=jdbc:mysql://localhost:3306/your_database
spring.datasource.username=your_username
spring.datasource.password=your_password

# Run the project
mvn spring-boot:run

# Test API using Postman (POST /api/user/login)
# Body (JSON)
{
  "name": "admin",
  "password": "admin123"
}

# Expected Response:
"WELCOME TO ADMIN DASHBOARD"
```
