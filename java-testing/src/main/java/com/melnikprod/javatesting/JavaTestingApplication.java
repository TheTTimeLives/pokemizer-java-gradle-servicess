package com.melnikprod.javatesting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javatesting.config.*;

@SpringBootApplication
public class JavaTestingApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaTestingApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}