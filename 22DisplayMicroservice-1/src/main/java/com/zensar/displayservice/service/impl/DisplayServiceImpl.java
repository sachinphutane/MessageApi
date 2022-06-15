package com.zensar.displayservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.zensar.displayservice.feign.client.MessageFeignClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class DisplayServiceImpl {
	
	@Autowired
	private MessageFeignClient feignClient;
	
	@CircuitBreaker(name="messageservice",fallbackMethod = "handleFailure")
	public String printMessage() {
		return feignClient.callGenerateMessage();
		
	}
	
	public String handleFailure(Throwable t) {
		return "this is default message because MessageService is not running...please try again...";
	}

}
