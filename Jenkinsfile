pipeline {
    agent none
    stages{
        stage('Non-Parallel Stage') {
            agents{
                label "master"
            }
            steps {
                echo "This stage will be executd first";
            }
        }
        stage('Run Tests') {
            parallel {
                stage('Test on Windows') {
                    agent{
                        label "Windows_Node"
                    }
                }
            }
            steps {
                echo "Task1 on Agent";
            }
        }
        stage('Test on Master') {
            agent {
                label "master"
            }
            steps {
                echo "Tasks1 on Master" 
                    
                    
                }
               
            }
        }
        
    }
}
