def call(){
    echo "Here we are building the project"
    sh "docker build -t ritiksuteri/gemini-clone-app:v2 ."
    echo "Code builded successfully"
}
