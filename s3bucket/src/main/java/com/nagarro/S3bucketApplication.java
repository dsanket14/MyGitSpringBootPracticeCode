package com.nagarro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class S3bucketApplication {

	public static void main(String[] args) {
		SpringApplication.run(S3bucketApplication.class, args);

	}

}
