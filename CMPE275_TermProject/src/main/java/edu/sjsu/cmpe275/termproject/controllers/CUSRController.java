package edu.sjsu.cmpe275.termproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class CUSRController {


	@Autowired
	private CUSRController cusrcontroller;
	
	
	@RequestMapping("/")
	public String sayHello()
	{
		return "Hello!";
	}


}
