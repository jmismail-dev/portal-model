pipeline {
    agent any
    tools { nodejs 'Node16.15.0' }
    stages {
        stage('Test') {
            steps {
                sh '''  
                node--version
                npm--version
                '''
            }
        }
        stage('Build') {
            steps {
                // sh "echo Skipped Build Stage"
                sh '''
                   npm install
                   cd client /
                    npm ci
                   npm run build
                '''
            }
        }
        // stage('Deploy') {
        //     steps {
        //         // sh 'sudo rm -rf /var/www/jenkins-monorepo'
        //         // sh "cd ${c} && ls"
        //         sh "sudo cp -r ${WORKSPACE}/client/dist/ /var/www/jenkins-monorepo"
        //         sh "cd ${WORKSPACE}/ && ls"
        //         sh "sudo rsync -av --progress --exclude='client' ${WORKSPACE}/ /home/jmismail/monorepo"
        //     }
        // }
    }
}