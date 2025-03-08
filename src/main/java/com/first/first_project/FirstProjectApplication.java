package com.first.first_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@SpringBootApplication
@RestController
public class FirstProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstProjectApplication.class, args);
	}

	@GetMapping("/")
	public String rootEndPoint() {
		String message = "Hello World!";
		return message;
	}
	
	@GetMapping("/hello")
	public String helloEndPoint(@RequestParam(value = "name", defaultValue = "World") String name) {
		String message = "Hello " + name + "!";
		return message;
	
	}
	
}
