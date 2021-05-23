package com.in28min.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28min.ms.beans.Limits;
import com.in28min.ms.config.LimitsConfig;

@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfig limitsConfig;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitsConfig.getMinimum(),limitsConfig.getMaximum());
	}

}
