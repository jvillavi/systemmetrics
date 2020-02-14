FROM openjdk:latest
COPY target/systemmetrics-0.0.1-SNAPSHOT.jar /opt/
RUN java -jar /opt/systemmetrics-0.0.1-SNAPSHOT.jar
EXPOSE 8080
