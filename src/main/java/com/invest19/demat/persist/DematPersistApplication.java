package com.invest19.demat.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.invest19.demat.persist.services.config.ConfigurationService;

@SpringBootApplication
public class DematPersistApplication extends SpringBootServletInitializer {


	static private ConfigurationService configurationService;

	public static void main(String[] args) {
		SpringApplication.run(DematPersistApplication.class, args);
	}

	@Autowired
	public void setConfigurationService(ConfigurationService configurationService1) {
		configurationService = configurationService1;
	}

	

}
