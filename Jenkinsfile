pipeline {
  agent none
  stages {
      stage('Build') {
          steps {
              sh 'mvn compiler:compile'
          }
      }
      stage('Test') {
          steps {
              sh 'mvn test'
          }
          post {
              always {
                  junit 'target/surefire-reports/*.xml'
              }
          }
      }
  }
}
