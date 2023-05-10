FROM openjdk:8
EXPOSE 8082
COPY ./target/outreach_portal-0.0.1-SNAPSHOT.jar ./
WORKDIR ./
ENTRYPOINT ["java", "-jar", "outreach-portal.jar"]
