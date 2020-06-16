FROM openjdk:8-jre
COPY target/spring-transaction.jar spring-transaction.jar
ENTRYPOINT ["java", "-jar", "/spring-transaction.jar"]
