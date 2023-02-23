/**
 * 
 */
package com.melnikprod.javatesting.controllers;

import java.util.logging.Logger;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author melnikprod
 *
 */
@RestController
//@CrossOrigin(origins = "*", allowedHeaders = "*")
@CrossOrigin(origins = "http://localhost:4200")
public class BasicRestController {
	  private static final Logger LOGGER = Logger.getLogger(BasicRestController.class.getName());

	@GetMapping("/hello")
	public String hello() {
	    LOGGER.info("The test method was hit");
		return "hello from the other side";
	}

}
