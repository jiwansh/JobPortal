# 💼 JobPortal

A **Spring Boot-based Job Portal Application** built to manage job listings, employer postings, and related job services. It follows a clean monolithic architecture with separate layers for model, repository, service, and controller.

---

## 🏗️ Project Structure

JobPortal/  
├── src/  
│ └── main/  
│ ├── java/org/jiwanshu/jobapp/  
│ │ ├── model/ # Entity classes (Job, Employer, etc.)  
│ │ ├── repo/ # Spring Data JPA Repositories  
│ │ ├── service/ # Service layer  
│ │ ├── JobAppApplication.java  
│ │ └── JobController.java # Main REST Controller  
│ ├── resources/  
│ │ └── application.properties  
│ └── webapp/ # (If used for frontend templates)  
│
├── test/java/org/jiwanshu/jobapp/  
│ └── JobAppApplicationTests.java  
├── pom.xml # Maven build config  

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- Maven
- RESTful APIs
- H2 / MySQL Database
- Lombok

---

## 🔍 Features

- 📋 Post and manage job listings
- 🧑‍💼 CRUD operations for employer/job entities
- 🧠 Service layer for business logic
- 📡 REST APIs to interact with the system
- 🧪 Unit testing framework

---

## ▶️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/jiwansh/JobPortal.git
cd JobPortal
```
### 2. Build and Run
```bash
./mvnw spring-boot:run
```
### 3. Access Application
Base URL: http://localhost:8080

APIs: accessible via JobController
### Sample Endpoints
Defined in `JobController.java`

 `GET /jobs` - List all jobs

 `POST /jobs` - Add a new job

 `GET /jobs/{id}` - Get job by ID

 `DELETE /jobs/{id}` - Delete a job
