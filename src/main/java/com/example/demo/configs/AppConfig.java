package com.example.demo.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public Product laptop() {
		return new Product(101, "Dell Laptop","images/laptop.jpg", 35000.00, 4.2);
	}
	
	@Bean
	public Product mobilePhone() {
		return new Product(102, "Dell mobile","images/phone.jpg", 15000.00, 4.8);
	}
	
	@Bean
	public Product printer() {
		return new Product(103, "Dell printer","images/printer.jpg", 5000.00, 4.3);
	}
}
