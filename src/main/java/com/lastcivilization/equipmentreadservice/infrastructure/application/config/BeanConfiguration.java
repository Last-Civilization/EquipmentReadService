package com.lastcivilization.equipmentreadservice.infrastructure.application.config;

import com.lastcivilization.equipmentreadservice.domain.EquipmentService;
import com.lastcivilization.equipmentreadservice.domain.port.EquipmentRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.lastcivilization.equipmentreadservice.infrastructure.database")
@EntityScan("com.lastcivilization.equipmentreadservice.infrastructure.database")
@ComponentScan("com.lastcivilization.equipmentreadservice")
public class BeanConfiguration {

    @Bean
    EquipmentService equipmentService(EquipmentRepository equipmentRepository) {
        return new EquipmentService(equipmentRepository);
    }
}

