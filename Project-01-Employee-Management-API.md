# Project 1 – Employee Management API

## Goal

Build a REST API using Spring Boot to understand the complete backend architecture.

**Duration:** 2–3 Days

---

# Learning Objectives

- Spring Boot project setup
- Spring MVC
- REST API development
- Controller → Service → Repository architecture
- Dependency Injection
- Spring Data JPA
- PostgreSQL/MySQL integration
- DTO pattern
- Bean Validation
- Global Exception Handling
- Pagination & Sorting
- Logging
- Swagger/OpenAPI documentation

---

# Minimal Functional Requirements

## Employee

Fields:

- id
- firstName
- lastName
- email
- department
- salary
- createdAt

---

## API Endpoints

### Create Employee

POST /employees

---

### Get Employee By ID

GET /employees/{id}

---

### Get All Employees

GET /employees

Support:

- pagination
- sorting

---

### Update Employee

PUT /employees/{id}

---

### Delete Employee

DELETE /employees/{id}

---

### Search by Department

GET /employees/department/{department}

---

# Validation

- First name required
- Last name required
- Valid email
- Salary > 0

---

# Error Handling

Return custom responses for:

- Employee not found
- Validation errors
- Bad requests

---

# Documentation

- Swagger UI
- OpenAPI

---

# Success Criteria

The project is complete when:

- All CRUD APIs work
- Validation is implemented
- Custom exceptions are returned
- Pagination works
- Swagger documentation is available
- Data is stored in PostgreSQL/MySQL