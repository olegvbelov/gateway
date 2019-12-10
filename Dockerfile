FROM openjdk:8-alpine
ADD target/gateway-0.1.0.jar gateway.jar

ENV TZ=Europe/Moscow

ENTRYPOINT ["java", "-jar", "gateway.jar"]