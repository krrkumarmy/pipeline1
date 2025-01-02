pipeline
{
    agent any
    stages
    {
        stage(print hello message)
        step{echo "Hello Messgae"}
    }
    stages
    {
        stage("print deploying")
        step{echo "hi"}
    }




}