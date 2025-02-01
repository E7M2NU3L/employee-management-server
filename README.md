# Employee Management API

## Overview
The Employee Management API is a Java-based RESTful service designed for efficient employee data management. Built with Spring Boot and secured with Spring Security, this API offers robust CRUD operations to handle employee details. The application is containerized using Docker for seamless deployment and scalability.

## Features
- **CRUD Operations:** Create, Read, Update, and Delete employee details.
- **Spring Security:** Secure endpoints with authentication and authorization mechanisms.
- **Docker Support:** Easily deployable in any environment with Docker.

## Technologies Used
- Java
- Spring Boot
- Spring Security
- Docker
- RESTful API

## Getting Started
### Prerequisites
- Java 11+
- Docker
- Maven

### Installation
1. **Clone the Repository:**
   ```bash
   git clone <repository-url>
   cd employee-management-api
   ```
2. **Build the Application:**
   ```bash
   mvn clean install
   ```
3. **Run with Docker:**
   ```bash
   docker build -t employee-management-api .
   docker run -p 8080:8080 employee-management-api
   ```

## API Endpoints
- **Create Employee:** `POST /api/employees`
- **Get All Employees:** `GET /api/employees`
- **Get Employee by ID:** `GET /api/employees/{id}`
- **Update Employee:** `PUT /api/employees/{id}`
- **Delete Employee:** `DELETE /api/employees/{id}`

## Security
The API uses Spring Security to protect endpoints. Authentication is required for all operations.

## License
This project is licensed under the MIT License.

## Contact
For queries or support, please contact Emmanuel A at aemmanuel.codes@gmail.com

