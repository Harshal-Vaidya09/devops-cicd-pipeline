# Stage 1: Build the application
FROM maven:3.9.11-eclipse-temurin-17 AS builder

WORKDIR /build

COPY pom.xml .
COPY .mvn .mvn
COPY mvnw .
COPY src src

RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

# Stage 2: Runtime image
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=builder /build/target/cicd-demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]