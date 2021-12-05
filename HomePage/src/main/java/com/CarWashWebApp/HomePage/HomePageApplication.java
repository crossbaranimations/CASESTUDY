package com.CarWashWebApp.HomePage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HomePageApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomePageApplication.class, args);
	}

}
