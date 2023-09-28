def call(String project, String ImageTag, String hubUser){
    //docker rmi ${hubUser}/${project} ${hubUser}/${project}:latest
    sh """
     docker rmi ${hubUser}/${project}:${ImageTag}
    """
}

// def call(String aws_accout_id, String region, String ecr_repoName){
//     sh """
//         docker rmi ${ecr_repoName}:latest ${aws_accout_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }