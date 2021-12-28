FROM ubuntu:14.04 

USER root
RUN wget http://mirror.olnevhost.net/pub/apache/maven/binaries/apache-maven-3.2.1-bin.tar.gz
tar zxf apache-maven-3.2.1-bin.tar.gz

RUN wget https://dl.google.com/linux/direct/google-chrome-stable_current_amd64.deb
sudo apt install ./google-chrome-stable_current_amd64.deb


