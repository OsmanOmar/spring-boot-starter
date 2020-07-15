package com.osman.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		var xx = "nima";

		System.out.println(xx.contains("m"));
		SpringApplication.run(SpringBootStarterApplication.class, args);
	}

}
