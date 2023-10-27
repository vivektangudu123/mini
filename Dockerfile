FROM openjdk:11
COPY ./target/calulator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-cp","caluldocker run -it -d --name Unscientific bean6792/calculatorator-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]