FROM openjdk:11
COPY ./target/calulator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","calulator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]