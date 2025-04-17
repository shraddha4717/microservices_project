package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SelectProduceClientForCrud9098Application {

	public static void main(String[] args) {
		SpringApplication.run(SelectProduceClientForCrud9098Application.class, args);
		System.out.println("select employee---");
	}

}
