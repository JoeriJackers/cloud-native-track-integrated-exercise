FROM openjdk:12

LABEL maintainer="joeri.jackers@gmail.com"

ENV ENV "DEV"
COPY target/testApi-0.0.1-SNAPSHOT.jar /opt/

EXPOSE 8080

CMD ["java", "-jar", "/opt/testApi-0.0.1-SNAPSHOT.jar"]
