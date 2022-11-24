package com.cts;

import com.cts.sample.MyMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class JuitTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(JuitTestApplication.class, args);
	}


}
