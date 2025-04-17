package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class DeleteProduceClientForCrud9097Application {

	public static void main(String[] args) {
		SpringApplication.run(DeleteProduceClientForCrud9097Application.class, args);
		System.out.println("delete Client---");
	}

}
