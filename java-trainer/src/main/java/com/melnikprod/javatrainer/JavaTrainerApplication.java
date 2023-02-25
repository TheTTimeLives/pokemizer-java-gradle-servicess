package com.melnikprod.javatrainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javatrainer.config.*;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// instantiates the beans for the common library. If you include the local maven package without using it and don't include this, your tests will break for no reason.
@ComponentScan(basePackages = {"com.melnikprod.javacommon"})
public class JavaTrainerApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaTrainerApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}
