package com.lastcivilization.equipmentreadservice.infrastructure.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EquipmentReadServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EquipmentReadServiceApplication.class, args);
    }

}
