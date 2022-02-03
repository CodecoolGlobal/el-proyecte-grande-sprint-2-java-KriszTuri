package com.webapp.projectgreenhouse;

import javax.annotation.PostConstruct;

import com.service.SampleDBData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.controller", "com.model", "com.service", "com.configuration"})
@EntityScan({"com.model"})
@EnableJpaRepositories(basePackages = {"com.model.repositories"})
public class ProjectGreenhouseApplication {

    @Autowired
    SampleDBData sampleDBData;

    public static void main(String[] args) {
        SpringApplication.run(ProjectGreenhouseApplication.class, args);
    }

    @PostConstruct
    public void fillDatabase() {
        sampleDBData.createSampleData();
    }

}
