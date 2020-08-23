FROM java:8
MAINTAINER AKS
EXPOSE 8080
COPY target/Hostname-Example-1.0.0 /home/Hostname-Example-1.0.0
CMD ["java","-jar","/home/Hostname-Example-1.0.0"]
