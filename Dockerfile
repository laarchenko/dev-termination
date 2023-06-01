# Use an OpenJDK base image
FROM openjdk:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the JAR file into the container
COPY target/devTerminate-0.0.1-SNAPSHOT.jar app.jar

# Expose the port on which the Spring application listens
EXPOSE 8080

ENTRYPOINT ["java", "-Xmx16m", "-Dspring.main.banner-mode=off", "-jar", "/app/app.jar", "2>>", "/dev/termination-log"]