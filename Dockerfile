FROM openjdk:8
ADD target/pathology-service-ms-0.0.1-SNAPSHOT.jar pathology-service-ms.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","pathology-service-ms.jar"]
