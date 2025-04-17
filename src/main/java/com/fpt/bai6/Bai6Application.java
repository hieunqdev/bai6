package com.fpt.bai6;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
	    "com.fpt.bai6.controller",
	    "com.fpt.bai6.repository",
	    "com.fpt.bai6.service",
	    "com.fpt.bai6.model",
	    "com.fpt.bai6.config"
	})

public class Bai6Application {

	public static void main(String[] args) {
		SpringApplication.run(Bai6Application.class, args);
	}

}
