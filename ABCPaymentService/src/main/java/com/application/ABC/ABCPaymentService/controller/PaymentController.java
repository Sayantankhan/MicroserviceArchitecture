package com.application.ABC.ABCPaymentService.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
	
	@Value("${server.port}")
	private String server_port;

	@GetMapping(value="/v1/{order_id}/getPrice")
	public ResponseEntity<?> getResponse(){
		return new ResponseEntity<String>("dummyPrice: 5000, application_port: "+server_port,HttpStatus.OK);
	}
}
