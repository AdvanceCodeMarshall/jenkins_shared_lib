// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      docker image build -t ${hubUser}/${project} . 
//      docker image tag ${hubUser}/${project} ${hubUser}/${project}:${ImageTag}
//      docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
//     """
// }

def call(String awsAccountId, String region, String ecrRepoName){
    sh """
        docker build -t ${ecrRepoName} .
        docker tag ${ecrRepoName}:latest ${awsAccountId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}
