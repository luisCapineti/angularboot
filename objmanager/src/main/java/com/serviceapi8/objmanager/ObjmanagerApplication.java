package com.serviceapi8.objmanager;

import org.apache.catalina.filters.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ObjmanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjmanagerApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter(){
		
	}
}
