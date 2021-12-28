FROM ubuntu:14.04 

USER root

ARG MAVEN_VERSION=3.8.4
ARG USER_HOME_DIR="/root"


RUN apt-get update
RUN apt --update --no-cache add openjdk8 curl
RUN mvn clean install
RUN mvn test =Dtest="CreateBooking"

RUN mkdir -p /usr/share/maven /usr/share/maven/ref \
 && curl -fsSL -o /tmp/apache-maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
 && tar -xzf /tmp/apache-maven.tar.gz -C /usr/share/maven --strip-components=1 \
 && rm -f /tmp/apache-maven.tar.gz \
 && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
 
 ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

# Define working directory.
WORKDIR /data

# Define commonly used JAVA_HOME variable
ENV JAVA_HOME /usr/lib/jvm/default-jvm/

# Define default command.
CMD ["mvn", "--version"]
