FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD  target/demo.* /app.jar
CMD ["java", "-jar", "/app.jar"]
EXPOSE 8080