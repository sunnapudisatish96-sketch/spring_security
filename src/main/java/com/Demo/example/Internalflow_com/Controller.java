package com.Demo.example.Internalflow_com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/public")
	public String publicEndPoint() {
		return("This is PUBLIC.No Logging the process");
	}
	@GetMapping("/user")
	public String userEndPoint() {
		return ("User logged in");
		
	}
	@GetMapping("/admin")
	public String adminEndPoint() {
	return ("admin logged in");
	}
}
