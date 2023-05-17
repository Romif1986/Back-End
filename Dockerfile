FROM amazoncorretto:17-alpine-jdk
MAINTAINER romi1986
COPY target/tp-0.0.1-SNAPSHOT.jar  tp-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/tp-0.0.1-SNAPSHOT.jar"]