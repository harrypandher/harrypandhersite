package com.harrypandher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;


/**
 * @author Harpreet Singh
 *
 */
@SpringBootConfiguration
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
@ComponentScan(basePackages = {"com.harrypandher"})
public class CoreApplication extends SpringBootServletInitializer {
 
	public CoreApplication() {
	    super();
	    setRegisterErrorPageFilter(false); // <- this one
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(CoreApplication.class);
	}

	public static void main(String[] args) {
		try {
		SpringApplication.run(CoreApplication.class, args);
		}catch(Exception e) {
			e.printStackTrace();
		}
		}
	@Bean
	public MultipartResolver multipartResolver() {
		return new StandardServletMultipartResolver();
	}
	
}
