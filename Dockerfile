FROM openjdk:17-jdk-slim
EXPOSE 9090
ADD target/demo-grow.jar demo-grow.jar
ENTRYPOINT ["java", "-jar", "demo-grow.jar"]
