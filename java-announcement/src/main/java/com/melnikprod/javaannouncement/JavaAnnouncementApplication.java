package com.melnikprod.javaannouncement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javaannouncement.config.*;

@SpringBootApplication
public class JavaAnnouncementApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaAnnouncementApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}