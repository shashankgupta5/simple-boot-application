pipeline {
    agent any
    stages {
        stage('Checkout SCM') {
            steps {
                script {
//                    echo 'Pulling...' + env.BRANCH_NAME   
                    git 'https://github.com/shashankgupta5/simple-boot-application'
                }
            }
        }
        stage('Build Code') {
            steps {
                script {
                    def mvn = tool name: 'maven-3', type: 'maven'
                    sh "${mvn}/bin/mvn clean install -Pcode-coverage"
                }
            }
        }
        stage('Archive Lib') {
            steps {
                script {
                     archiveArtifacts 'target/'
                }
            }
        }
    }
    post {
        always {
            deleteDir()
        }
    }
}
