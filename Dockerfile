FROM openjdk:11-jdk-slim-buster
WORKDIR /app

COPY target/*.jar /app/app.jar

ENTRYPOINT java -jar /app/app.jar