package com.invest19.demat.persist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)

public class SwaggerConfig {
	
	@Bean
	public Docket getDocket() {
//		return new Docket(DocumentationType.SWAGGER_2)
//				.apiInfo(getApiInfo());
//		
		
		return new Docket(DocumentationType.SWAGGER_2)
		          .select()
		          .apis(RequestHandlerSelectors.basePackage("com.invest19.demat.persist"))
		          .paths(PathSelectors.any())
		          .build()
		          .apiInfo(apiInfo());
		       //   .securitySchemes(Arrays.asList(apiKey()));
				
	}

	public ApiInfo apiInfo() {
		Contact contact= new Contact("Invest19","","invest	@invest19.in");
		String licenseUrl = ServletUriComponentsBuilder.fromPath("/eula.html")
		.toUriString();
		 return new ApiInfoBuilder().title("Invest19 API Documentation")
	                .description("Invest19 API").termsOfServiceUrl("")
	                .contact(contact)
	                .license("Invest19 EULA")
	                .licenseUrl(licenseUrl)
	                .version("1.0.0")
	                .build();
	}
	
	
//	@Bean
//	public Docket api() {
//		
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.invest19.demat.persist.persist.endpoints"))
//				.paths(PathSelectors.ant("/api/**")).build().apiInfo(apiInfo());
//	}
//
//	private ApiInfo apiInfo() {
//
//		ApiInfo apiInfo = new ApiInfoBuilder().version("1.0").title("Demat Persistance Rest Api")
//				.description("These apis helps to save data to database")
//				.contact(new Contact("Sandeep Malviya", "Sandeep URL", "sandeepmalviya@gmail.com"))
//				.license("License of API : All Rights are reserved with developer")
//				.licenseUrl("no licence url is available")
//				.termsOfServiceUrl("Terms of service : Development And Deveting Support is For 4 Weeks")
//				.version("1.0.0").build();
//
//		return apiInfo;
//	}

}
