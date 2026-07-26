# Task Tracker REST API

A lightweight, layered Spring Boot backend REST API to perform CRUD operations on tasks.

## 🛠️ Tech Stack
* **Java 21 / 17**
* **Spring Boot 3** (Spring Web)
* **Maven**
* **Postman** (API Testing)

## 🏗️ Architecture
`Controller Layer` ➡️ `Service Layer` ➡️ `Model Layer`

## 🔗 REST Endpoints

| HTTP Method | Endpoint | Description |
| :--- | :--- | :--- |
| `GET` | `/tasks` | Fetch all tasks |
| `GET` | `/tasks/{id}` | Fetch task by ID |
| `POST` | `/tasks` | Create a new task |
| `DELETE` | `/tasks/{id}` | Delete task by ID |

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_USERNAME/tasktracker.git](https://github.com/YOUR_USERNAME/tasktracker.git)
