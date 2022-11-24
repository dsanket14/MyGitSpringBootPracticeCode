package com.nag;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class GenratePdfApplication {

	public static void main(String[] args) {
		SpringApplication.run(GenratePdfApplication.class, args);
	}

}
