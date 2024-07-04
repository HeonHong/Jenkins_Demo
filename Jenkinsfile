pipeline {
    agent { docker { image 'gradle:8.8.0-jdk17-focal' } }
    stages {
        stage('build') {
            steps {
                sh 'gradlew --version'
            }
        }
    }
}