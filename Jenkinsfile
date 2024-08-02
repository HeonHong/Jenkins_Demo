pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                echo 'build jar'
                sh 'chmod +x gradlew'
                sh './gradlew build'
            }//steps
        }//build
        stage('Build Docker Image'){
            steps{
                echo 'build Image'
                sudo usermod -aG docker $USER
                sh 'docker stop jenkins_demo'
//                 sh 'docker rm jenkins_demo'
                sh 'docker build -t jenkins_demo .'
            }
        }//build docker image
        stage('Deploy Docker Container'){
            steps{
                echo 'deploy'
                sh 'docker run --rm --name jenkins_demo -d -p 8081:8081 jenkins_demo'
            }//steps
        }//Deploy Docker Container
    }//stages

}//pipeline
//문제점 : 만약에 빌드가 잘못됐을 경우, 도커가 이미 다운된 상태라서 복구가 안됨
// pipeline {
//     agent {
//         docker {
//             image 'gradle:8.8-jdk17-alpine'
//             args '-p 8082:8082'
//         }
//     }
//     stages {
//         stage('build') {
//             steps {
//                 echo "new Dockerfile"
//                 sh 'chmod +x gradlew'
//                 sh './gradlew build'
//             }
//         }//build
//         stage('deploy'){
//             steps {
//                 sh 'nohup java -jar build/libs/jenkins_demo-0.0.1-SNAPSHOT.jar > app.log 2>&1 &'
//             }
//         }//deploy
//     }
// }
//
