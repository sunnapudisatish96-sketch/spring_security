package com.Demo.example.Internalflow_com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class InternalflowComApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternalflowComApplication.class, args);
	}

}
