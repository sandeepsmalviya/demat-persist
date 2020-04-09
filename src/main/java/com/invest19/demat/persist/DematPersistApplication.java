package com.invest19.demat.persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.invest19.demat.persist.persist.services.config.ConfigurationService;

@SpringBootApplication
public class DematPersistApplication extends SpringBootServletInitializer {

	private static Logger logger = LoggerFactory.getLogger(DematPersistApplication.class);

	static private ConfigurationService configurationService;

	public static void main(String[] args) {
		SpringApplication.run(DematPersistApplication.class, args);
		logger.info(configurationService.getMyApplicationMessage());
	}

	@Autowired
	public void setConfigurationService(ConfigurationService configurationService1) {
		configurationService = configurationService1;
	}

	

}
