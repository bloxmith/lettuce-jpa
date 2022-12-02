FROM amazoncorretto:11-alpine-jdk
COPY target/application.jar application.jar
ENTRYPOINT ["java","-jar","/application.jar"]
