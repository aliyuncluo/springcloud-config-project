package com.cluo.cloudbus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringcloudConfigRefreshCloudBusApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigRefreshCloudBusApplication.class, args);
    }

}
