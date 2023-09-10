def call(String project,String imageTag, String hubUser){
    sh """
     docker image build -t ${hubUser}:${project} .
     docekr image tag ${hubUser}/${project} ${hubUser}/${project}:${imageTag}
     docekr image tag ${hubUser}/${project} ${hubUser}/${project}:latest
    """
}