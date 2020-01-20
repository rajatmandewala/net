package com.mvn.mvn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MvnApplication extends SpringBootServletInitializer{
    
     @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MvnApplication.class);
    }
	public static void main(String[] args) {
		SpringApplication.run(MvnApplication.class, args);
	}
}
