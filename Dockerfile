FROM openjdk:11
COPY ./target/cal-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","cal-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]