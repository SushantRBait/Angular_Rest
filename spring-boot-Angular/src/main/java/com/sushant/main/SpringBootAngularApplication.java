package com.sushant.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.sushant.main"})
public class SpringBootAngularApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularApplication.class, args);
	}

}
