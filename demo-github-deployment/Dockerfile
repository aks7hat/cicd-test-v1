FROM openjdk:17-jdk-alpine
RUN mkdir /app
WORKDIR /app
COPY target/demo-github-deployment-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["--spring.profiles.active=gcp"]
ENTRYPOINT ["java", "-jar", "demo-github-deployment-0.0.1-SNAPSHOT.jar"]