FROM openjdk:21-slim
ARG jarfilepath
RUN mkdir /src
WORKDIR /src
VOLUME /src/tomcat
ADD target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","demo-0.0.1-SNAPSHOT.jar"]