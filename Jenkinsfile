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
                //sh 'curl -v -u admin:admin --upload-file target/calculator-1.0-SNAPSHOT.jar http://localhost:8081/repository/poc/calculator-1.0-SNAPSHOT.jar'
                sh 'mvn deploy:deploy-file -DgroupId=com.chakray -DartifactId=calculator -Dversion=1.0-SNAPSHOT -DgeneratePom=true -Dpackaging=jar -DrepositoryId=localnexus -Durl=http://localhost:8081/repository/poc/ -Dfile=target/calculator-1.0-SNAPSHOT.jar'
            }
        }
    }
}