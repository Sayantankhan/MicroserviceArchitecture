package com.application.ABC.ABCProductService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RestController
@RibbonClient("ABCPaymentService")
@RefreshScope
public class ProductController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/ABC/{productid}")
	public String getProductPrice(@PathVariable String productid) {
		return template.getForObject("http://ABCPaymentService/v1/"+productid+"/getPrice", String.class);
	}
}
