package com.example.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;

import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
	        return builder.routes()
	        		 .route("Driver-Microservices", r -> r
	                         .path("/api/driver/**")
	                         .uri("http://localhost:8086"))
	                 // Route for Booking microservice
	                 .route("Booking-Microservices", r -> r
	                         .path("/api/booking/**")
	                         .uri("http://localhost:8085"))
	                 .route("Route-Microservices", r -> r
	                         .path("/api/route/**")
	                         .uri("http://localhost:8087"))
	                 .route("Registration-Microservices", r -> r
	                         .path("/api/registration/**")
	                         .uri("http://localhost:8088"))
	                 .route("Vehicle-Microservice", r -> r
	                         .path("/api/vehicle/**")
	                         .uri("http://localhost:8089"))
	                 .build();
	    }
}