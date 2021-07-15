package com.team.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.team")
public class EmployeeManageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManageApplication.class, args);
	}

}
