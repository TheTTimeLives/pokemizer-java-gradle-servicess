# Since these are on Java 17
FROM openjdk:17-jdk-slim
# Copy the jar to a new file called app.jar
COPY build/libs/java-battle-0.0.1-SNAPSHOT.jar /app.jar
# Allow web traffic
EXPOSE 8080
# Run the jar on launch
ENTRYPOINT ["java","-jar","/app.jar"]

# Since these are on Java 17
FROM openjdk:17-jdk-slim

# Copy the jar to a new file called app.jar
COPY build/libs/java-battle-0.0.1-SNAPSHOT.jar /app.jar
# Copy the common jar so it will exist in the container
COPY ../java-common/build/libs/java-common-0.0.1-SNAPSHOT.jar /java-common.jar
# Putting the common jar on the classpath so it can be grabbed
ENV CLASSPATH /java-common.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]