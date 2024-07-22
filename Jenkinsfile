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
            }
        }//build
        stage('deploy'){
            steps {
                sh 'nohup java -jar build/libs/jenkins_demo-0.0.1-SNAPSHOT.jar > app.log 2>&1 &'
            }
        }//deploy
    }
}