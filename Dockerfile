FROM openjdk:11
EXPOSE 8081
ADD target/docker-jenkins.jar docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins.jar"]