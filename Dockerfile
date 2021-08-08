FROM openjdk:8-alpine

COPY target/uberjar/fchw.jar /fchw/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/fchw/app.jar"]
