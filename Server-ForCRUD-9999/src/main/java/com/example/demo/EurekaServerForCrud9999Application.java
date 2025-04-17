package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServerForCrud9999Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerForCrud9999Application.class, args);
		System.out.println("eureka server running....");
	}

}
