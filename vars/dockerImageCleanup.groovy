// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      docker rmi ${hubUser}/${project}:${ImageTag}
//      docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
//     """
// }

//docker rmi ${ecr_repoName}:latest ${aws_accout_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
def call(String aws_accout_id, String region, String ecr_repoName){
    sh """
        
        docker rmi ${ecr_repoName}:latest public.ecr.aws/y5u5u6n0/${ecr_repoName}:latest
    """
}