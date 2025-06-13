package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

	@PostConstruct
	public void init(){
		logger.info("App started....");
	}

	public static void main(String[] args) {

		logger.info("App executed....");
		SpringApplication.run(DemoApplication.class, args);
	}

}
