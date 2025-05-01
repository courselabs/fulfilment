FROM maven:3.9.8-eclipse-temurin-22-alpine AS builder

WORKDIR /usr/src/api
COPY pom.xml .
RUN mvn -B dependency:go-offline

COPY . .
RUN mvn package

# app
FROM eclipse-temurin:22-jre-alpine

WORKDIR /app
COPY --from=builder /usr/src/api/target/fulfilment-api-0.1.0.jar .

ENV OTEL_METRICS_EXPORTER=none \
    OTEL_TRACES_EXPORTER=none

EXPOSE 80
ENTRYPOINT ["java", "-jar", "/app/fulfilment-api-0.1.0.jar"]