package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.core.io.DefaultResourceLoader;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer
{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
//		return applicationBuilder.sources(DemoApplication.class)
//				.initializers(configurableApplicationContext -> {
//					ClassLoader classLoader = getClass().getClassLoader();
//					((DefaultResourceLoader)configurableApplicationContext).setClassLoader(classLoader);
//				});
//	}
}
