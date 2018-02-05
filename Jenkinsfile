pipeline {
  agent any
  tools {
    maven 'Maven 3.5.2'
    jdk 'jdk9'
  }
  stages {
    stage ('Initialize') {
      steps {
          sh '''
              echo "PATH = ${PATH}"
              echo "M2_HOME = ${M2_HOME}"
          '''
          }
      }
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
