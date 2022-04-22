FROM openjdk:18-jdk-alpine

COPY ./target/*.jar /app.jar

EXPOSE 6039

EXPOSE 27017

ENTRYPOINT ["java","-jar","/app.jar"] 
