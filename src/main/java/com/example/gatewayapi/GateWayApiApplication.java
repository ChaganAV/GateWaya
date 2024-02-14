package com.example.gatewayapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GateWayApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(GateWayApiApplication.class,args);
    }
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("Microservice2",r->r.path("/service2/**")
                        .uri("http://localhost:8082/")).build();
    }
}
