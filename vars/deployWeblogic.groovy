
def call(Map config = [:]) {

    sh "curl -v -u ${config.user}:${config.password} -T /root/tomcat/wars/mvnwebapp.war 'http://localhost:8081/manager/text/deploy?path=/myapp&update=true'"
    echo "User is , ${config.user}."

}
