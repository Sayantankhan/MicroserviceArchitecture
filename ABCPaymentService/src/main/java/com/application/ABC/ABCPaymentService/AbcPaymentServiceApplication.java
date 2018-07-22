package com.application.ABC.ABCPaymentService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AbcPaymentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcPaymentServiceApplication.class, args);
	}
}
