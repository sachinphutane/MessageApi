package com.zensar.messageapi.web.controller.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class GlobalExceptionHandler {
	
	@ExceptionHandler(Exception.class)
    public String handleException()
    {
        return "error";
    }

}
