package com.OnDemandCarWash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class WasherApplication {

	public static void main(String[] args) {
		SpringApplication.run(WasherApplication.class, args);
	}

}
