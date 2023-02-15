package com.melnikprod.javapokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javapokedex.config.*;

@SpringBootApplication
public class JavaPokedexApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaPokedexApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}