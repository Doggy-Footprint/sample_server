FROM tomcat:11.0.0
LABEL authors="Doggy-FP"

EXPOSE 8080
COPY ./build/libs/sample_server-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps

