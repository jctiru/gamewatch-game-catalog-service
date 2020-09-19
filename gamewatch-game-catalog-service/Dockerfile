FROM adoptopenjdk/openjdk11-openj9:alpine-jre
ARG JAR_FILE=target/gamewatch-game-catalog-service-0.0.1-SNAPSHOT.jar
WORKDIR /opt/app
COPY ${JAR_FILE} app.jar
ENTRYPOINT [ "java", "-Xsoftmx32m", "-Xmx48m", "-Xss256k", "-XX:IdleTuningMinIdleWaitTime=60", "-Xtune:virtualized", "-XX:+CompactStrings", "-Xshareclasses:name=gamecatalog,cacheDir=/opt/app/jvm/openj9/shareclasses,verbose", "-Xscmx128m", "-jar", "app.jar", "--spring.profiles.active=prod" ]
EXPOSE 8081
