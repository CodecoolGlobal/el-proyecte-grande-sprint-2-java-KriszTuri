package com.webapp.projectgreenhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.controller", "com.model", "com.service"})
@EntityScan({"com.model"})
@EnableJpaRepositories(basePackages = {"com.model.repositories"})
public class ProjectGreenhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectGreenhouseApplication.class, args);
    }

}
