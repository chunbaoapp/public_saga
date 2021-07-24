FROM adoptopenjdk/openjdk11:ubi
ARG WAR_FILE=target/saga*.war
RUN mkdir /opt/test
COPY ${WAR_FILE} /opt/test/event-sage.war
CMD ["java", "-jar", "/opt/test/event-saga.war"]