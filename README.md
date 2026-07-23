# 🚀 Java Calculator CI/CD Project using Jenkins, Docker & AWS EC2

## 📌 Project Overview

This project demonstrates a complete CI/CD pipeline for a Java Spring Boot application using Jenkins, Docker, Docker Hub, and AWS EC2.

The application is built using Spring Boot, containerized with Docker, automatically built and tested using Jenkins, pushed to Docker Hub, and deployed on an Amazon EC2 instance.

---

## 🏗️ Architecture

```
                Developer
                    │
                    ▼
               GitHub Repository
                    │
                    ▼
            Jenkins CI Pipeline
                    │
       ┌────────────┴────────────┐
       │                         │
       ▼                         ▼
 Maven Build               Run Unit Tests
       │
       ▼
 Docker Image Build
       │
       ▼
 Docker Hub
       │
       ▼
 AWS EC2 Instance
       │
       ▼
 Docker Container
       │
       ▼
 Java Spring Boot Application
```

---

# 🛠️ Technologies Used

- Java 17
- Spring Boot
- Maven
- Git
- GitHub
- Jenkins
- Docker
- Docker Hub
- AWS EC2 (Amazon Linux)
- Linux
- IntelliJ IDEA

---

# 📂 Project Structure

```
java-calculator/
│
├── src/
│   ├── main/
│   └── test/
│
├── Dockerfile
├── Jenkinsfile
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .mvn/
└── README.md
```

---

# ⚙️ Jenkins Pipeline Stages

✔ Checkout Source Code

✔ Maven Build

✔ Unit Testing

✔ Docker Image Build

---

# 🐳 Docker Commands

## Build Image

```bash
docker build -t java-calculator .
```

## Tag Image

```bash
docker tag java-calculator snehaakangire8/java-calculator:latest
```

## Push Image

```bash
docker push snehaakangire8/java-calculator:latest
```

---

# ☁️ AWS EC2 Deployment

## Pull Docker Image

```bash
docker pull snehaakangire8/java-calculator:latest
```

## Run Container

```bash
docker run -d --name java-calculator -p 8080:8080 snehaakangire8/java-calculator:latest
```

## Verify Running Container

```bash
docker ps
```

---

# 🌐 Access Application

```
http://<EC2-Public-IP>:8080
```

Application Response:

```
Welcome to Java Application
```

---

# 📋 Features

- Spring Boot Application
- Automated CI Pipeline using Jenkins
- Maven Build Automation
- Unit Testing
- Docker Containerization
- Docker Hub Integration
- AWS EC2 Deployment
- End-to-End CI/CD Workflow

---

# 📸 Project Screenshots

Add screenshots of:

- GitHub Repository
- Jenkins Successful Pipeline
- Docker Build Logs
- Docker Hub Repository
- AWS EC2 Instance
- Running Docker Container
- Browser Output

---

# 🚀 Future Enhancements

- REST APIs for Calculator Operations
- Automatic Deployment from Jenkins to EC2
- Nginx Reverse Proxy
- HTTPS using SSL
- Kubernetes Deployment
- Terraform Infrastructure
- Monitoring using Prometheus & Grafana

---

# 👩‍💻 Author

**Sneha Akangire**

GitHub:
https://github.com/sneha-akangire8

Docker Hub:
https://hub.docker.com/u/snehaakangire8

---

# ⭐ Learning Outcomes

Through this project, I learned:

- Git & GitHub
- Jenkins CI Pipeline
- Maven Build Automation
- Docker Image Creation
- Docker Hub Image Repository
- AWS EC2 Deployment
- Linux Commands
- Spring Boot Deployment
- End-to-End CI/CD Implementation
