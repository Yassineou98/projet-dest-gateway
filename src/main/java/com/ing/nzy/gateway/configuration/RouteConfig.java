package com.ing.nzy.gateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig {


    @Bean
    public RouteLocator route(RouteLocatorBuilder builder) {
        return builder
                .routes()
                .route(r -> r.path("interieur-route", "/api/v1/persons/**").uri("http://localhost:8081"))
                .route(r -> r.path("finance-route", "/api/v1/amendes/**").uri("http://localhost:8082"))
                .build();
    }

}
