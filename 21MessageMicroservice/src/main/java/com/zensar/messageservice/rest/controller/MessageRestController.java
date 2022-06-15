package com.zensar.messageservice.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {
	
	@GetMapping("/api/message")
	public String generateMessage() {
		return "Welcome to Microservics world";
	}
	
	

}
