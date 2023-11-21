FROM openjdk:17
WORKDIR workspace-spring-tool-suite-4-4.17.0.RELEASE/CinematecaServerV2/src/main/java/br/com/appcinemateca
COPY . /usr/src/app/CinematecaServerV2


RUN java ApiApplication.java
CMD [ "java", ApiApplication.java" ]