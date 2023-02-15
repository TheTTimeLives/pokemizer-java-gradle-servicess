package com.melnikprod.javatrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javatrainer.config.*;

@SpringBootApplication
public class JavaTrainerApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaTrainerApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}
