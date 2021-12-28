FROM ubuntu:14.04 

USER root

RUN apt-get update
RUN mvn clean install
RUN mvn test =Dtest="CreateBooking"
