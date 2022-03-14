
def call(Map config = [:]) {

    curl -v -u deploy:deploy -T mvnwebapp.war 'http://localhost:8081/manager/text/deploy?path=/myapp&update=true'

}
