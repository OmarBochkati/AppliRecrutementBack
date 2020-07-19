package com.pfe.appliRecrutement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(value = "classpath:spring/application-config.xml")
public class AppliRecrutementApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AppliRecrutementApplication.class);
    }

	public static void main(String[] args) {
		SpringApplication.run(AppliRecrutementApplication.class, args);
	}
}
