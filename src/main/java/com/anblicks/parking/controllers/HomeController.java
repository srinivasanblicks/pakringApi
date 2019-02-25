package com.anblicks.parking.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anblicks.parking.Application;

import io.swagger.annotations.ApiOperation;

@RestController
public class HomeController{
	private final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@ApiOperation(value = "This will by Default Redirects to Swagger UI")
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() throws Exception {
		logger.info("Serving the Home Request...");
		return "redirect:/swagger-ui.html";
	}

}
