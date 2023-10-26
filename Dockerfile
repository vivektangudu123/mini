FROM openjdk:11
COPY ./target/calculator.jar ./
WORKDIR ./
CMD [“java”,”-cp”,” Calculator.jar”,”org.example.Main”]