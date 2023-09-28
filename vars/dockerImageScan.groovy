// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      trivy image ${hubUser}/${project}:latest > scan.txt
//      cat scan.txt
//     """
// }

//     trivy image ${aws_accout_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest > scan.txt

def call(String aws_accout_id, String region, String ecr_repoName){
    sh """
       trivy image ${ecr_repoName}:latest public.ecr.aws/y5u5u6n0/${ecr_repoName}:latest > scan.txt
       cat scan.txt
    """
}