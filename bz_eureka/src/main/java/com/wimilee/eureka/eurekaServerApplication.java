package com.wimilee.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {GsonAutoConfiguration.class})
@EnableEurekaServer
public class eurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(eurekaServerApplication.class);
    }
}
