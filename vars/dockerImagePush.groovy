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

def call(String awsAccountId, String region, String ecrRepoName){
    sh """
        aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${awsAccountId}.dkr.ecr.${region}.amazonaws.com
        docker push ${awsAccountId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}
