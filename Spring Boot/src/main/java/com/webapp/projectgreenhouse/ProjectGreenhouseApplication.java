package com.webapp.projectgreenhouse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"controller", "model", "service"})
public class ProjectGreenhouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectGreenhouseApplication.class, args);
    }

}
