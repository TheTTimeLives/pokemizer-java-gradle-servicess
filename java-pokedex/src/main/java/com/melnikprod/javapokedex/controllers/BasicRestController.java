/**
 * 
 */
package com.melnikprod.javapokedex.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author melnikprod
 *
 */
@RestController
public class BasicRestController {
	  private static final Logger LOGGER = Logger.getLogger(BasicRestController.class.getName());
	
	@GetMapping("/hello")
	public String helloTaylor() {
	    LOGGER.info("This is a log message");
		return "hello";
	}

}
