FROM java:8
MAINTAINER AKS
EXPOSE 8080
COPY target/Hostname-Example-1.0.0.jar /home/Hostname-Example-1.0.0.jar
CMD ["java","-jar","/home/Hostname-Example-1.0.0.jar"]
