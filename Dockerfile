FROM maven
RUN echo '镜像初始化完成'
COPY ./bz_eureka .
EXPOSE 8761
CMD ["mvn","clean"]
CMD ["mvn","install"]
#CMD ["java","-jar","target/bz_eureka-1.0-SNAPSHOT-jar-with-dependencies.jar"]