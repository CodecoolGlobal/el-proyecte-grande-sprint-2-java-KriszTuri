package com.webapp.projectgreenhouse;

import javax.annotation.PostConstruct;

import com.configuration.SecurityConfiguration;
import com.service.SampleDBData;

import org.apache.catalina.security.SecurityConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@SpringBootApplication(scanBasePackages = {"com.controller", "com.model", "com.service"})
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

    /*protected void configure(HttpSecurity http) throws Exception{
        http
        .csrf().disable()
        .httpBasic().disable()
        .authorizeRequests().antMatchers("/**").permitAll();

    }*/

}
