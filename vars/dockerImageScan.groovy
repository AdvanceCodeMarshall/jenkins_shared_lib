// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      trivy image ${hubUser}/${project}:latest > scan.txt
//      cat scan.txt
//     """
// }

def call(String awsAccountId, String region, String ecrRepoName){
    sh """
        trivy image ${awsAccountId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest > scan.txt
        cat scan.txt
    """
}