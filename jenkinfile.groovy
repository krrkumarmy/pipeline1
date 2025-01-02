pipeline
{
    agent any
    stages
    {
        stage("print hello message")
        {steps{echo "Hello Messgae"}}        

    
        stage("print deploying")
        {steps{echo "Deploying"}}
        
    
        stage("print deployed")
        {steps{echo "Deployed Successfully"}}
    }

}
