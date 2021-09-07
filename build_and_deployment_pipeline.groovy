pipeline
{
    agent any
    environment{
        REPO="${params.REPO_NAME}"
        BRANCH="${params.BRANCH_NAME}"
        TEXT="${params.TEXT}"
    }
    stages{
        stage("Checkout SCM")
        {
            steps{
                script{
                    echo "checkout SCM"
                }
            }
        }
        stage("Build Provisioning"){
            steps{
                script{
                    echo "build provisioning"
                }
            }
        }
        stage("Static Code Analysis"){
            steps{
                script{
                    echo "Ststic Code Analysis"
                }
            }
        }
        stage("Upload Artifacts"){
            steps{
                script{
                    echo "Upload Artifacts"
                }
            }
        }
        stage("Deploy"){
            steps{
                script{
                    echo "Deploy"
                }
            }
        }
    }
}