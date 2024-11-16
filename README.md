# Bank Management System

## Project Overview
This project is a simple Bank Management System implemented using Java and Spring Boot. The system provides RESTful APIs to manage bank accounts, allowing for the creation of accounts, fetching account details by account number, and retrieving all accounts.

## Technologies Used
- Java
- Spring Boot
- Spring Data JPA (for database operations)
- RESTful API
- postgresql Database (in-memory database for simplicity, can be replaced with another database if needed)

## Prerequisites
Make sure you have the following tools installed:
- Java 17 or higher
- Maven
- An IDE like IntelliJ IDEA or Eclipse

## Setup and Run the Project

### 1. Clone the Repository

git clone https://github.com/yourusername/bank-management-system.git
cd bank-management-system


## Project Description

### Bank Management System

The **Bank Management System** is a simple web application developed using Java and Spring Boot. It provides a set of RESTful APIs for managing bank accounts, allowing users to perform basic banking operations such as creating a new account, retrieving account details, and viewing all existing accounts.

The project is designed with a focus on simplicity and efficiency, leveraging Spring Boot's capabilities for rapid development. An in-memory H2 database is used for data storage, making it easy to run and test without additional setup.

### Key Features
- **Create New Account**: Create a bank account with a unique account number, account holder's name, and initial balance.
- **Retrieve Account Details**: Fetch account information using the account number.
- **View All Accounts**: Retrieve a list of all bank accounts stored in the system.

### Technology Stack
- **Backend**: Java, Spring Boot
- **Database**: H2 (in-memory database)
- **Build Tool**: Maven
- **API Design**: RESTful API

### Objectives
The primary goal of this project is to demonstrate a simple yet effective way of managing bank accounts using RESTful services. It can serve as a foundation for more advanced banking systems that include features like fund transfers, user authentication, transaction history, and other banking operations.

### Future Enhancements
- Add user authentication and authorization to secure the API.
- Introduce input validation for account creation.
- Implement additional features such as money transfer and transaction history.
- Migrate to a robust relational database like PostgreSQL or MySQL for better scalability and persistence.
