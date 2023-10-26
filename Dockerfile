FROM openjdk:11
COPY ./target/calculator.jar ./
WORKDIR ./
CMD [“java”,”-cp”,” calculator.jar”,”org.example.Main”]