FROM maven
MAINTAINER wimilee
RUN echo '镜像初始化完成'
COPY ./bz_eureka ./bz_eureka
WORKDIR /bz_eureka
EXPOSE 8761
RUN echo '项目编译完成'
ENTRYPOINT [ "sh", "-c", "java -Xmx50m -Djava.security.egd=file:/dev/./urandom -jar /bz_eureka/target/bz_eureka-1.0-SNAPSHOT.jar" ]
