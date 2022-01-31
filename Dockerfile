FROM openjdk:8-jdk-alpine
COPY build/libs/RewardCentral-0.0.1-SNAPSHOT.jar RewardCentral-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/RewardCentral-0.0.1-SNAPSHOT.jar"]
