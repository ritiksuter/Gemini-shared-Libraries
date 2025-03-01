def call(){
     echo "Here we need to Push the image to dockerHub"
     withCredentials([usernamePassword(credentialsId: 'secretCred', passwordVariable: 'dockerHubPass', usernameVariable: 'dockerHubUser')]) {
            sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"
            sh "docker push ritiksuteri/gemini-clone-app:v2"
     }
     echo "Docker image pushed successfully"
}
