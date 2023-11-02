package com.mrvkings.springcaching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringcachingApplication {
	
	static Logger logger=LoggerFactory.getLogger(SpringcachingApplication.class);

	public static void main(String[] args) {
		
		logger.info("In ------------------------ SpringcachingApplication");
		SpringApplication.run(SpringcachingApplication.class, args);
	}

}
