pipeline {

    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    environment {
        IMAGE_NAME = "harshalsvaidyaa/cicd-demo"
        IMAGE_TAG = "${BUILD_NUMBER}"
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build') {
            steps {
                dir('app/cicd-demo') {
                    sh './mvnw clean package'
                }
            }
        }

        stage('Build Docker Image') {
            steps {
                dir('app/cicd-demo') {
                    sh 'docker build -t $IMAGE_NAME:$IMAGE_TAG .'
                }
            }
        }

        stage('Push Docker Image') {
            steps {
                withCredentials([
                    usernamePassword(
                        credentialsId: 'dockerhub',
                        usernameVariable: 'USERNAME',
                        passwordVariable: 'PASSWORD'
                    )
                ]) {
                    sh '''
                    echo $PASSWORD | docker login -u $USERNAME --password-stdin
                    docker push $IMAGE_NAME:$IMAGE_TAG
                    docker logout
                    '''
                }
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh """
                kubectl set image deployment/cicd-demo \
                cicd-demo=$IMAGE_NAME:$IMAGE_TAG
                """
            }
        }

        stage('Verify Rollout') {
            steps {
                sh 'kubectl rollout status deployment/cicd-demo'
            }
        }

    }

    post {

        success {
            echo "Deployment Successful"
        }

        failure {
            echo "Deployment Failed"
        }

        always {
            sh 'docker image prune -f'
        }

    }

}