def call(){
    echo "Here we need to deploy the code"
    sh "docker run -p 5173:5173 -d ritiksuteri/gemini-clone-app:v2"
}
