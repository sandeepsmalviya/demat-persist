package com.invest19.demat.persist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class DematPersistApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DematPersistApplication.class, args);
	}
}
