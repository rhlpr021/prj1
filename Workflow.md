# Project 1 – Employee Management API Tracker

---

## Daily Progress Log
Update this section each day with the story you are working on:

- **Date:** YYYY-MM-DD
- **Story ID:** STORY-XXX
- **Notes:** Brief update on progress

---

## Epics Overview

| Epic ID | Epic Title | Description |
|---------|------------|-------------|
| [EPIC-1](#epic-1-project-setup) | Project Setup | Initialize Spring Boot project and dependencies |
| [EPIC-2](#epic-2-core-architecture) | Core Architecture | Implement MVC layers and dependency injection |
| [EPIC-3](#epic-3-employee-crud-apis) | Employee CRUD APIs | Build endpoints for employee management |
| [EPIC-4](#epic-4-validation--error-handling) | Validation & Error Handling | Add bean validation and global exception handling |
| [EPIC-5](#epic-5-advanced-features) | Advanced Features | Implement pagination, sorting, and search |
| [EPIC-6](#epic-6-documentation) | Documentation | Add Swagger/OpenAPI documentation |
| [EPIC-7](#epic-7-database-integration) | Database Integration | Integrate PostgreSQL/MySQL with JPA |

---

## Epics & Stories

### EPIC-1: Project Setup
**Goal:** Set up Spring Boot project with required dependencies.

- [STORY-101](#story-101-create-spring-boot-project-skeleton) – Create Spring Boot project skeleton  
- [STORY-102](#story-102-configure-mavengradle-dependencies) – Configure Maven/Gradle dependencies  
- [STORY-103](#story-103-setup-applicationproperties-for-environment) – Setup application.properties for environment  

---

### EPIC-2: Core Architecture
**Goal:** Establish Controller → Service → Repository structure.

- [STORY-201](#story-201-create-base-controller-class) – Create base Controller class  
- [STORY-202](#story-202-implement-service-layer-with-di) – Implement Service layer with DI  
- [STORY-203](#story-203-setup-repository-interfaces-with-spring-data-jpa) – Setup Repository interfaces with Spring Data JPA  

---

### EPIC-3: Employee CRUD APIs
**Goal:** Implement all CRUD endpoints.

- [STORY-301](#story-301-create-employee-endpoint) – Create Employee endpoint (POST /employees)  
- [STORY-302](#story-302-get-employee-by-id) – Get Employee by ID (GET /employees/{id})  
- [STORY-303](#story-303-get-all-employees-with-paginationsorting) – Get All Employees with pagination/sorting (GET /employees)  
- [STORY-304](#story-304-update-employee) – Update Employee (PUT /employees/{id})  
- [STORY-305](#story-305-delete-employee) – Delete Employee (DELETE /employees/{id})  
- [STORY-306](#story-306-search-employees-by-department) – Search Employees by Department (GET /employees/department/{department})  

---

### EPIC-4: Validation & Error Handling
**Goal:** Ensure data integrity and proper error responses.

- [STORY-401](#story-401-add-validation-for-fields) – Add validation for firstName, lastName, email, salary  
- [STORY-402](#story-402-implement-global-exception-handler) – Implement global exception handler  
- [STORY-403](#story-403-return-custom-error-responses) – Return custom error responses for validation failures and not found  

---

### EPIC-5: Advanced Features
**Goal:** Add enhancements for usability.

- [STORY-501](#story-501-implement-pagination-support) – Implement pagination support  
- [STORY-502](#story-502-implement-sorting-support) – Implement sorting support  
- [STORY-503](#story-503-add-logging-for-api-requestsresponses) – Add logging for API requests/responses  

---

### EPIC-6: Documentation
**Goal:** Provide API documentation.

- [STORY-601](#story-601-integrate-swagger-ui) – Integrate Swagger UI  
- [STORY-602](#story-602-generate-openapi-specification) – Generate OpenAPI specification  

---

### EPIC-7: Database Integration
**Goal:** Persist data with relational database.

- [STORY-701](#story-701-configure-postgresqlmysql-connection) – Configure PostgreSQL/MySQL connection  
- [STORY-702](#story-702-map-employee-entity-with-jpa-annotations) – Map Employee entity with JPA annotations  
- [STORY-703](#story-703-test-database-crud-operations) – Test database CRUD operations  

---

## Story Details

### STORY-101 Create Spring Boot project skeleton
**Description:** Use Spring Initializr to generate base project with required dependencies.

---

### STORY-102 Configure Maven/Gradle dependencies
**Description:** Add dependencies for Spring Web, JPA, Validation, Swagger.

---

### STORY-103 Setup application.properties for environment
**Description:** Configure server port, datasource, and JPA properties.

---

### STORY-201 Create base Controller class
**Description:** Define REST controller for Employee endpoints.

---

### STORY-202 Implement Service layer with DI
**Description:** Add business logic in service classes using dependency injection.

---

### STORY-203 Setup Repository interfaces with Spring Data JPA
**Description:** Create repository interfaces for Employee entity.

---

### STORY-301 Create Employee endpoint
**Description:** Implement POST /employees to add new employee.

---

### STORY-302 Get Employee by ID
**Description:** Implement GET /employees/{id} to fetch employee details.

---

### STORY-303 Get All Employees with pagination/sorting
**Description:** Implement GET /employees with pagination and sorting support.

---

### STORY-304 Update Employee
**Description:** Implement PUT /employees/{id} to update employee details.

---

### STORY-305 Delete Employee
**Description:** Implement DELETE /employees/{id} to remove employee.

---

### STORY-306 Search Employees by Department
**Description:** Implement GET /employees/department/{department} to filter employees.

---

### STORY-401 Add validation for fields
**Description:** Ensure firstName, lastName, email, and salary validations.

---

### STORY-402 Implement global exception handler
**Description:** Add @ControllerAdvice to handle exceptions globally.

---

### STORY-403 Return custom error responses
**Description:** Provide meaningful error messages for validation and not found cases.

---

### STORY-501 Implement pagination support
**Description:** Add pageable support in repository and controller.

---

### STORY-502 Implement sorting support
**Description:** Allow sorting by fields like salary, createdAt.

---

### STORY-503 Add logging for API requests/responses
**Description:** Configure logging framework for request/response tracking.

---

### STORY-601 Integrate Swagger UI
**Description:** Add Swagger configuration for API documentation.

---

### STORY-602 Generate OpenAPI specification
**Description:** Provide OpenAPI spec for API endpoints.

---

### STORY-701 Configure PostgreSQL/MySQL connection
**Description:** Setup datasource in application.properties.

---

### STORY-702 Map Employee entity with JPA annotations
**Description:** Annotate Employee class with @Entity and field mappings.

---

### STORY-703 Test database CRUD operations
**Description:** Verify CRUD operations with database integration tests.

---
