package com.application.ABC.ABCProductService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AbcProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcProductServiceApplication.class, args);
	}
}
