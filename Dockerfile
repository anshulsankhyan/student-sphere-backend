FROM openjdk:8
EXPOSE 8082
COPY ./target/.jar ./
WORKDIR ./
ENTRYPOINT ["java", "-jar", "outreach-portal.jar"]
