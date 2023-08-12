package com.atrezzo.manager;

import jakarta.transaction.Transactional;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Transactional
public class AtrezzoManagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(AtrezzoManagerApplication.class, args);
	}

}
