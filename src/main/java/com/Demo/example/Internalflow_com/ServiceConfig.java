package com.Demo.example.Internalflow_com;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ServiceConfig {
	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1=User
				.withUsername("Satish")
				.password("{noop}1234")
				.roles("USER")
				.build();
		UserDetails admin=User
				.withUsername("admin")
				.password("{noop}admin678")
				.roles("ADMIN")
				.build();
		return new  InMemoryUserDetailsManager(user1,admin);
	}
	@Bean
	public SecurityFilterChain filterChains(HttpSecurity http) throws Exception{
		http
		.authorizeHttpRequests(auth -> auth
				.requestMatchers("/public").permitAll()
				.requestMatchers("/user").hasRole("USER")
				.requestMatchers("/admin").hasRole("ADMIN")
				.anyRequest().authenticated());
		http.httpBasic(Customizer.withDefaults());
		return http.build();
				
		
	}

}
