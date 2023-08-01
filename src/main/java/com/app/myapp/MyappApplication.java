package com.app.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

@SpringBootApplication
@RestController
public class MyappApplication {

	@Autowired
	private Environment env;


	// @Value("${app.title:default_value}")
	// private String appTitle = env.getProperty("app.title");
	

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}
	@GetMapping("/")
 	public String index() {
 		return env.getProperty("app.description");
 	}
}
