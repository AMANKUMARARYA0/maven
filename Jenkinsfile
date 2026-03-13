node {
  stage('cloning maven project')
  {
    git 'https://github.com/AMANKUMARARYA0/maven.git'
  }
  stage('Building maven project')
  {
    sh 'mvn package'
  }
  stage('print'){
    echo "Hi, my name is Aman"
}
}
