package com.an.antry.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BannerApplication {
    public static void main_banner(String[] args) {
        SpringApplication app = new SpringApplication(BannerApplication.class);
        app.setShowBanner(false);
        app.run(args);
    }
}
