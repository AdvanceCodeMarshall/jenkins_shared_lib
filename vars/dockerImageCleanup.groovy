// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      docker rmi ${hubUser}/${project}:${ImageTag}
//      docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
//     """
// }

def call(String awsAccountId, String region, String ecrRepoName){
    sh """
        docker rmi ${ecrRepoName}:latest ${awsAccountId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}