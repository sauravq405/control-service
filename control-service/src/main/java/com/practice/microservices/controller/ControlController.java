package com.practice.microservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.microservices.Configuration;
import com.practice.microservices.beans.ControlConfiguration;

@RestController
public class ControlController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/control")
	public ControlConfiguration getControlFromConfiguration() {
		
		return new ControlConfiguration(configuration.getMax(), configuration.getMin());
	}

}
