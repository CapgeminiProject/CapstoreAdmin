package com.capgemini.adminstore.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication(scanBasePackages= {"com.capgemini.adminstore"})
@EntityScan(basePackages="com.capgemini.adminstore.beans")
@EnableJpaRepositories(basePackages="com.capgemini.adminstore.repo")
@EnableWebMvc
public class AdminstoreApplicationMain extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(AdminstoreApplicationMain.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(AdminstoreApplicationMain.class);
	}
}
