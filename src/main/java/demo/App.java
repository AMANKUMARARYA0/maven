pipeline {
    agent any

<<<<<<< HEAD
    tools {
        maven 'Maven'
=======
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Aman Arya! from CI CD task package hi from demo by jenkins" );
>>>>>>> f1ba4d80ece4b574bd3e51421281cf23a7cb9c88
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