pipeline {
    agent any

    stages {

        stage('cloning maven project') {
            steps {
                git branch: 'main', url: 'https://github.com/AMANKUMARARYA0/maven.git'
            }
        }

        stage('build') {
            steps {
                sh 'mvn clean package'
            }
        }

    }
}