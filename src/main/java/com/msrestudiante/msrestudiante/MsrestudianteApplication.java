package com.msrestudiante.msrestudiante;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@EnableReactiveMongoRepositories
public class MsrestudianteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsrestudianteApplication.class, args);
	}
}
