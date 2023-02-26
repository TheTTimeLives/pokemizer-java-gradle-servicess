# Use the Gradle image with Java 17
FROM gradle:jdk17 as builder

# Copy the Gradle build files
COPY build.gradle.kts settings.gradle.kts gradle.properties /home/gradle/project/

# Copy the source code
COPY src /home/gradle/project/src

# Build the application
WORKDIR /home/gradle/project/
RUN gradle bootJar

# Use the slim Java 17 image
FROM openjdk:17-jdk-slim
# Copy the jar to a new file called app.jar
COPY --from=builder /home/gradle/project/build/libs/java-battle-0.0.1-SNAPSHOT.jar /app.jar
# Allow web traffic
EXPOSE 8080
# Run the jar on launch
ENTRYPOINT ["java","-jar","/app.jar"]
