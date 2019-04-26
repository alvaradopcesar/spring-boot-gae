package com.example.demojar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJarApplication {

	public static void main(String[] args) {

		System.out.println("hello from app!");

		SpringApplication.run(DemoJarApplication.class, args);
	}

}
