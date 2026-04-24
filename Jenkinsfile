pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvnw.cmd clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                bat 'mvnw.cmd test'
            }
        }
        stage('Docker Build') {
            steps {
                bat 'docker build -t ajaysonawane06/selfheal-app .'
            }
        }
        stage('Deploy') {
            steps {
                bat 'kubectl apply -f deployment.yaml'
            }
        }
    }
}