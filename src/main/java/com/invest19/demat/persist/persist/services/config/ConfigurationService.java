package com.invest19.demat.persist.persist.services.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import lombok.Data;

@Service
@Data
public class ConfigurationService {

	@Value("${my.application.message}")
	private String myApplicationMessage;
	
	
	/*
	 * @Min(value = 15, message = "Age should not be less than 15")
	 * 
	 * @Max(value = 65, message = "Age should not be greater than 65") int age;
	 */
    

}
