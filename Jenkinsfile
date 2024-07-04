pipeline {
    agent {
        docker {
            image 'gradle:8.8-jdk17-alpine'
//             args '-v /root/.m2:/root.m2'
        }
    }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}