package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringApplication.class);

	@Test
	void contextLoads() {
		logger.info("Test case executing ...");
		logger.info("Test case executing second time...");
		assertEquals(true, true);
	}

}
