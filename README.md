# Java Calculator REST API

A simple Spring Boot REST API that performs the addition of two integer numbers.

## 🚀 Features

- Add two integer numbers
- REST API built with Spring Boot
- Unit testing using JUnit 5
- Maven build automation

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- Maven
- JUnit 5

## 📂 Project Structure

```
java-calculator
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.example.calculator
│   │   │       ├── CalculatorApplication.java
│   │   │       ├── CalculatorController.java
│   │   │       └── Calculator.java
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│       └── java
│           └── com.example.calculator
│               └── JavaCalculatorApplicationTests.java
│
├── pom.xml
├── README.md
└── .gitignore
```

## 🌐 API Endpoints

### Home

```
GET /
```

Response:

```
Welcome to the Java Calculator Application!
```

### Add Two Numbers

```
GET /add?num1=10&num2=20
```

Response:

```
The sum of 10 and 20 is: 30
```

## ▶️ Run the Application

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

## 🧪 Run Unit Tests

```bash
mvnw.cmd clean test
```

## 👩‍💻 Author

**Sneha Akangire**
