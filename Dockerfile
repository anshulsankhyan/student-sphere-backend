FROM openjdk:11
EXPOSE 8082
COPY ./target/outreach-portal.jar ./
WORKDIR ./
CMD ["java", "-jar", "outreach-portal.jar"]
