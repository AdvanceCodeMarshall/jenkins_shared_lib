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

def call(String aws_accout_id, String region, String ecr_repoName){
    sh """
      aws ecr get-login-password --region ${region} | docker login --username santoshtidke --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
      docker push ${aws_accout_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
    """
}
