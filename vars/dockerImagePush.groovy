def call(String project, String ImageTag, String hubUser){
    withCredentials([usernamePassword(
            credentialsId: 'docker', 
            passwordVariable: 'PASS', 
            usernameVariable: 'USER')]) {
        sh "docker login -u '$USER' -p '$PASS'"
    }
    sh "docker image push ${hubUser}/${project}:${ImageTag}"
    sh "docker image push ${hubUser}/${project}:latest"
}

// --------------------------ECR----------------------------------------

// def call(String aws_account_id, String region, String ecr_repoName){
    
//     withCredentials([[
//       $class: 'AmazonWebServicesCredentialsBinding',
//       credentialsId: 'aws',
//       accessKeyVariable: 'AWS_ACCESS_KEY_ID',
//       secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
      
//       sh "aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com"
//     }
//     sh " docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest"
    
// }
        
   
    

