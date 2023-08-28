package com.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder.Builder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServicegatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicegatewayApplication.class, args);
	}
	
	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder)
	{
		Builder routebuilder=builder.routes();
		routebuilder.route("route1",r->r.path("/customers/**").uri("http://localhost:9097/customers"));
		routebuilder.route("route1",r->r.path("/products/**").uri("http://localhost:9098/products"));
		
	  return routebuilder.build();
	}
}


