package com.an.antry.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Run application by
// java -jar app.jar --name="Spring"
@RestController
@EnableAutoConfiguration
public class NameApplication {

    @Value("${name}")
    private String name;

    @RequestMapping("/")
    String home() {
        return "Hello World " + name + " !";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(NameApplication.class, args);
    }
}
