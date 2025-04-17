package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientForCrud9091Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientForCrud9091Application.class, args);
		System.out.println("consumer client-------");
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate rt() 
	{
		RestTemplate rs = new RestTemplate();
		return rs;
	}

}
