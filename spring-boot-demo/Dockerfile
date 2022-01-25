FROM 		openjdk:8-jdk-alpine
LABEL  		author=xxx
ARG 		JAR_FILE=spring-boot-demo/target/*.jar
ENV			APP_NAME=DEMO
COPY 		$JAR_FILE /app/app.jar
COPY 		entrypoint.sh /app/
WORKDIR 	/app
RUN 		chmod +x entrypoint.sh;
ENTRYPOINT 	["./entrypoint.sh"]