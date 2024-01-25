FROM openjdk:17-jdk-alpine
ARG JAR_FILE=targer/*.jar
COPY ./target/ERPFullstackApp-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="Kuba"
ENTRYPOINT ["java", "-jar","/app.jar"]