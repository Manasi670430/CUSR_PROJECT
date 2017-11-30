package edu.sjsu.cmpe275.termproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	
	@RequestMapping(value="/searching/{id}/{id}", method=RequestMethod.GET,  consumes="application/json")
	public ResponseEntity<?> getTrain(@PathVariable Integer id)
	{
		return new ResponseEntity<>(cusrcontroller, HttpStatus.OK); 
	}
	

}
