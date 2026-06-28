pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Checking out source code...'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                dir('app/cicd-demo') {
                    sh 'mvn clean package -DskipTests'
                }
            }
        }

        stage('Test') {
            steps {
                dir('app/cicd-demo') {
                    sh 'mvn test'
                }
            }
        }
    }

    post {
        always {
            echo 'Pipeline Finished'
        }

        success {
            echo 'Build Successful'
        }

        failure {
            echo 'Build Failed'
        }
    }
}