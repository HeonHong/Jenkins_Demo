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
                sh 'docker build -t jenkins_demo .'
            }
        }//build docker image
        stage('Deploy Docker Container'){
            steps{
                echo 'deploy'
                sh 'docker run -d -p 8081:8081 jenkins_demo'
            }//steps
        }//Deploy Docker Container
    }//stages

}//pipeline

// pipeline {
//     agent {
//         docker {
//             image 'gradle:8.8-jdk17-alpine'
//             args '-p 8081:8081'
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