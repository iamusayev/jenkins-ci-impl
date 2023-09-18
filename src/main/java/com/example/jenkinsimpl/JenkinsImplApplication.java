package com.example.jenkinsimpl;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JenkinsImplApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsImplApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> System.out.println("Hello World");
    }

}
