/**
 * 
 */
package com.melnikprod.javatrainer.controllers;

import java.util.logging.Logger;

import com.melnikprod.javatrainer.models.Trainer;
import com.melnikprod.javatrainer.models.TrainerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author melnikprod
 *
 */
@RestController
public class BasicRestController {
	  private static final Logger LOGGER = Logger.getLogger(BasicRestController.class.getName());
	  private TrainerRepository trainerRepository;

	  // this is an init block, kotlin removes the need for this, and you can just declare on the line above
	public BasicRestController(TrainerRepository trainerRepository) {
		this.trainerRepository = trainerRepository;
	}
	
	@GetMapping("/hello")
	public Iterable<Trainer> helloTaylor() {
	    LOGGER.info("This is a log message");
		return trainerRepository.findAll();
	}

}
