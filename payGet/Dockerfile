FROM openjdk:17-alpine

WORKDIR /app

COPY target/payGet-0.0.1-SNAPSHOT.jar /app/spring-app.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]