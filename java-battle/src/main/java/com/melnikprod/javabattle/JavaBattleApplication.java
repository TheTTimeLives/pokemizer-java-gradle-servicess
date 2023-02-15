package com.melnikprod.javabattle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.melnikprod.javabattle.config.*;

@SpringBootApplication
public class JavaBattleApplication {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(JavaBattleApplication.class);
        application.addListeners(new ActiveProfilePrinter());
        application.run(args);
	}
}