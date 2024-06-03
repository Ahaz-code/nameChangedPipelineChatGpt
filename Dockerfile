FROM openjdk:17
EXPOSE 8080
ADD target/git-action-cicd.jar git-action-cicd.jar
ENTRYPOINT ["java","-jar","/git-action-cicd.jar"]