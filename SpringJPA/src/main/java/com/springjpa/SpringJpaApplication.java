package com.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.springjpa.service.PlayerServiceImplementation;

@SpringBootApplication
public class SpringJpaApplication {
	@Autowired
	PlayerServiceImplementation service;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

}
