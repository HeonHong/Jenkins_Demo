pipeline {
    agent { docker { image 'gradle:8.8-jdk17-alpine' } }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}