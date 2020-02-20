pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building...'
                sh 'mvn package -DskipTests'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh 'mvn test'
            }
        }
        stage("publish to nexus") {
            steps {
                sh 'ls -la'
                sh 'curl -v -u admin:admin --upload-file target/calculator-1.0-SNAPSHOT.jar http://localhost:8081/repository/iam-solution/calculator-1.0-SNAPSHOT.jar'
            }
        }
    }
}