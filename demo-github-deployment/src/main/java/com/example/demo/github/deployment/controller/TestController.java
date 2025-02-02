package com.example.demo.github.deployment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping
	public String greet() {
		return "Hello World Akshat";
	}
}
