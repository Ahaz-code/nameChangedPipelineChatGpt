package com.example.nameChangedPipelineChatGpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class NameChangedPipelineChatGptApplication {

	@GetMapping("/htllo")
	public String helloWorld(){
		return "hello world";
	}
	public static void main(String[] args) {
		SpringApplication.run(NameChangedPipelineChatGptApplication.class, args);
	}

}
