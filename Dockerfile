FROM openjdk:8
EXPOSE 8080
COPY target/spring-transaction.jar spring-transaction.jar
ENTRYPOINT ["java", "-jar", "/spring-transaction.jar"]
