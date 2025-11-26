package com.Ramexample.InMemoryUserDetailsManager.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	@GetMapping("/public")
	public String getpublicEndpage() {
		return "PUBLIC is the login";
	}
	@GetMapping("user")
	public String getHomePage() {
		return "Home page is loggin";
	}
	@GetMapping("/admin")
	public String getAdminPage() {
		return "Admin page process";
	}
	

}
