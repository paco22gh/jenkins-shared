
def call(Map config = [:]) {

    String destination = 'http://localhost:8081/manager/text/deploy?path=/myapp&update=true'
    sh "curl -v -u ${config.user}:${config.password} -T /root/tomcat/wars/mvnwebapp.war ${destination}"
    echo "User is , ${config.user}."

}
