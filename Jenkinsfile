pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './mvnw clean package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                sh './mvnw test'
            }
        }
        stage('Docker Build') {
            steps {
                sh 'docker build -t ajaysonawane06/selfheal-app .'
            }
        }
        stage('Deploy') {
            steps {
                sh 'kubectl apply -f deployment.yaml'
            }
        }
    }
}