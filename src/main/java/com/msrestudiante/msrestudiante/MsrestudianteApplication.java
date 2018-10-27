package com.msrestudiante.msrestudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@EntityScan(basePackages = "com.msrestudiante.Entidades")
@ComponentScan(basePackages = {"com.msrestudiante.Controladores"})
@EnableReactiveMongoRepositories(basePackages = "com.msrestudiante.Repositorios")
public class MsrestudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsrestudianteApplication.class, args);
	}
}
