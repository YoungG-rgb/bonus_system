FROM eclipse-temurin:21-jre

ARG BONUS_API_HOST
ARG MANAGEMENT_ZIPKIN_ENDPOINT

ENV BONUS_API_HOST=${BONUS_API_HOST}
ENV MANAGEMENT_ZIPKIN_ENDPOINT=${MANAGEMENT_ZIPKIN_ENDPOINT}

WORKDIR /app

COPY /target/bonus_gateway.jar /app/bonus_gateway.jar

CMD ["java", "-jar", "/app/bonus_gateway.jar"]