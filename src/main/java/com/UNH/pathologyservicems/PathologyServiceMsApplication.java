package com.UNH.pathologyservicems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
//@EnableEurekaClient
public class PathologyServiceMsApplication extends SpringBootServletInitializer {

	@Bean

	public  RestTemplate getRestTemplate() {
		return new RestTemplate();
	}



	public static void main(String[] args) {
		SpringApplication.run(PathologyServiceMsApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(PathologyServiceMsApplication.class);
	}
}
