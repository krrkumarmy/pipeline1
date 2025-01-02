pipeline
{
    agent any
    stages
    {
        stage("print hello message")
        step{echo "Hello Messgae"}

    
    {
        stage("print deploying")
        step{echo "Deploying"}
    }
        stage("print deployed")
        step{echo "Deployed Successfully"}
    }




}