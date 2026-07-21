pipeline {
    agent any

    stages {

        stage('Build') {
            steps {
                sh 'chmod +x mvnw'
                sh './mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t java-calculator:latest .'
            }
        }

        stage('Run Docker Container') {
            steps {
                sh '''
                docker rm -f java-calculator-app || true
                docker run -d --name java-calculator-app -p 8081:8080 java-calculator:latest
                '''
            }
        }
    }
}