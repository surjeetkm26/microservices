FROM adoptopenjdk/openjdk11:alpine-jre
RUN mkdir -p /opt/var
COPY /target/*.jar /opt/var
WORKDIR /opt/var
EXPOSE 8080
ENTRYPOINT ["java"," -jar", "test-app.jar"]