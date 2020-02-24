FROM openjdk:8
ADD target/pathology-service-ms.jar pathology-service-ms.jar
EXPOSE 8091
ENTRYPOINT ["java","-jar","pathology-service-ms.jar"]
