FROM openjdk:8-jdk-alpine
VOLUME /tmp

ENV DATABASE_USERNAME=sa
ENV DATABASE_PASSWORD=[pwd]
ENV DATABASE_CLUSTER=cluster0.8ne8q.mongodb.net
ENV DATABASE_NAME=read_in

ARG JAR_FILE
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]