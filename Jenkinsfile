pipeline {
    agent {
        docker {
            image 'gradle:8.8-jdk17-alpine'
        }
    }
    stages {
        stage('build') {
            steps {
                echo "new Dockerfile"
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }
        }
    }
}