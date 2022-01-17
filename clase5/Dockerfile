FROM openjdk:11
LABEL author Augusto Soria
ENTRYPOINT ["java", "-jar", "/work/tau.jar"]
RUN mkdir work
WORKDIR /work
COPY tau.jar /work/tau.jar
EXPOSE 8080

