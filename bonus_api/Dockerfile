FROM eclipse-temurin:21-jre

ARG MANAGEMENT_ZIPKIN_ENDPOINT

ENV MANAGEMENT_ZIPKIN_ENDPOINT=${MANAGEMENT_ZIPKIN_ENDPOINT}

WORKDIR /app

COPY /target/bonus_api.jar /app/bonus_api.jar

CMD ["java", "-jar", "/app/bonus_api.jar"]