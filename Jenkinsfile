pipeline {
  agent {
    node {
      label 'node1'
    }

  }
  stages {
    stage('build') {
      steps {
        sh '''echo "Build
"'''
      }
    }
    stage('deploy') {
      steps {
        sh '''echo "Deploy
"'''
      }
    }
  }
}