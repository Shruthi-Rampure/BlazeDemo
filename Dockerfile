FROM ubuntu:14.04 

USER root

docker run -it --rm \
       -v "$(pwd)":/opt/maven \
       -w /opt/maven \
       maven:3.2-jdk-7 \
       mvn clean install

# Define default command.
CMD ["mvn", "--version"]

RUN mvn test =Dtest="CreateBooking"
