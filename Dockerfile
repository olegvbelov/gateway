FROM openjdk:8-alpine
ADD target/gateway-0.0.2.jar gateway.jar

ENV TZ=Europe/Moscow

ENTRYPOINT ["java", "-jar", "gateway.jar"]