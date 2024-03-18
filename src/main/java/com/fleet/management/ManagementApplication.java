package com.fleet.management;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

	@Bean
	public OpenAPI headOpenApi(){
		return new OpenAPI()
				.info(new Info()
						.title("Fleet Management <<REST API>>")
						.version("0.1")
						.description("REST API with Spring Boot for querying taxi locations"));

	}
}
