package com.example.EcommerceSpring;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {
		Dotenv dotenv= Dotenv.configure().load();
		System.setProperty("PORT", dotenv.get("PORT"));
		SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
