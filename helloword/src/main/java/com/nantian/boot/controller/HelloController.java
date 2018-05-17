package com.nantian.boot.controller;

import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@ImportResource(locations = "classpath:beans.xml")
@RestController
public class HelloController {
	@GetMapping("hello")
	public String hello() {
		return "HelloWord";
	}
	
}
