package com.ouahidi.discovryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscovryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiscovryServiceApplication.class, args);
    }

}
