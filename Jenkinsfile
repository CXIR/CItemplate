pipeline {
  agent any
  tools {
    maven 'Maven'
    jdk 'Java'
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
      stage('SonarQube analysis') {
        steps{
          withSonarQubeEnv('SonarQube') {
            sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
          }
        }
      }
  }
}
