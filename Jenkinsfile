pipeline {
  agent any
  options {
    buildDiscarder logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '5', daysToKeepStr: '', numToKeepStr: '5')
  }
  stages {
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
            }
        }
	stage('cat README') {
      		when {
        	branch "fix-*"
      		}
      		steps {
        	sh '''
          		cat README.md
        	'''
      		}
    	}
        stage('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
    }
}
