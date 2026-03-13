pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    triggers {
        githubPush()
    }

    stages {

        stage('Clone Repository') {
            steps {
                git branch: 'main', url: 'https://github.com/AMANKUMARARYA0/maven.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'mvn clean compile'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }

    }

    post {
        success {
            echo 'Build and Tests Passed ✅'
        }
        failure {
            echo 'Build Failed ❌'
        }
    }
}