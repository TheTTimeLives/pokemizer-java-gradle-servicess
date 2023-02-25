# Since these are on Java 17
FROM openjdk:17-jdk-slim
# Copy the jar to a new file called app.jar
COPY build/libs/java-announcement-0.0.1-SNAPSHOT.jar /app.jar
# Allow web traffic
EXPOSE 8080
# Run the jar on launch
ENTRYPOINT ["java","-jar","/app.jar"]