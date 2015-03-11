package com.an.antry.spring.boot;

import javafx.scene.Parent;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class FluentBuilderApplication {
    public static void main_fluent(String[] args) {
        new SpringApplicationBuilder().showBanner(false).sources(Parent.class).child(FluentBuilderApplication.class)
                .run(args);
    }
}
