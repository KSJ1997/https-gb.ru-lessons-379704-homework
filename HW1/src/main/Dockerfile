FROM openjdk:8-jdk-alpine

WORKDIR /app

COPY ./src /app/src

RUN javac -d /app/out /app/src/main/java/com/mypackage/*.java /app/src/main/java/com/mypackage/operations/*.java

CMD ["java", "-classpath", "/app/out", "com.mypackage.main"]