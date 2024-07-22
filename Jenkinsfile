pipeline {
    agent {
        docker {
            image 'gradle:8.8-jdk17-alpine'
            args '-p 8081:8081'
        }
    }
    stages {
        stage('build') {
            steps {
                echo "new Dockerfile"
                sh 'chmod +x gradlew'
                sh './gradlew build'
//                 sh 'java -jar build/libs/jenkins_demo-0.0.1-SNAPSHOT.jar'
                sh 'groups'
                sh 'groups jenkins'
                sh 'getent group docker'
                sh 'sudo useradd -m -s /bin/bash jenkins'
                sh 'sudo usermod -aG docker jenkins'
                sh 'getent group docker'
                sh 'docker build -t jenkins_demo .'
                sh 'docker run -p 8081:8081 jenkins_demo'
            }
        }
    }
}