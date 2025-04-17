package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class UpdateProduceClientForCrud9096Application {

	public static void main(String[] args) {
		SpringApplication.run(UpdateProduceClientForCrud9096Application.class, args);
		System.out.println("updating client----");
	}

}
