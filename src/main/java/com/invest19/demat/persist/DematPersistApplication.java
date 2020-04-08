package com.invest19.demat.persist;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import com.invest19.demat.persist.persist.services.config.ConfigurationService;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
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

	@Bean
	public Docket api() {
		
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.invest19.demat.persist.persist.endpoints"))
				.paths(PathSelectors.ant("/api/**")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {

		ApiInfo apiInfo = new ApiInfoBuilder().version("1.0").title("Demat Persistance Rest Api")
				.description("These apis helps to save data to database")
				.contact(new Contact("Sandeep Malviya", "Sandeep URL", "sandeepmalviya@gmail.com"))
				.license("License of API : All Rights are reserved with developer")
				.licenseUrl("no licence url is available")
				.termsOfServiceUrl("Terms of service : Development And Deveting Support is For 4 Weeks")
				.version("1.0.0").build();

		return apiInfo;
	}

}
