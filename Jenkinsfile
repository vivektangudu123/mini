pipeline{
    environment{
        docker_image = ""
    }
    agent any
    stages{
        stage('Stage 1: Git Clone'){
           steps{
                git branch: 'main',
                url:'https://github.com/vivektangudu123/mini.git'
            }
        }
        stage('Step 2: Maven Build'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Step 3: Build Docker Image'){
            steps {
                script {
                    docker_image = docker.build "bean6792/calculator:latest"
                }
            }
        }
    }
}
