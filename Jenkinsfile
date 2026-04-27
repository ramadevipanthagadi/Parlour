pipeline {
    agent any

    tools {
        maven 'Maven'
    }

    stages {

        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Success') {
            steps {
                echo 'Build Successful!'
            }
        }
    }
}