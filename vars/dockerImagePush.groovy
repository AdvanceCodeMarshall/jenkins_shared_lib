// def call(String project, String ImageTag, String hubUser){
//     withCredentials([usernamePassword(
//             credentialsId: 'docker', 
//             passwordVariable: 'PASS', 
//             usernameVariable: 'USER')]) {
//         sh "docker login -u '$USER' -p '$PASS'"
//     }
//     sh "docker image push ${hubUser}/${project}:${ImageTag}"
//     sh "docker image push ${hubUser}/${project}:latest"
// }

//aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
def call(String aws_accout_id, String region, String ecr_repoName){
    sh """
      aws ecr-public get-login-password --region ${region} | docker login --username AWS --password-stdin public.ecr.aws/y5u5u6n0
      docker push ${aws_accout_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
