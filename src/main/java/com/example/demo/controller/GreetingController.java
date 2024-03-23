package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/greetings")
public class GreetingController {

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public String home(@RequestParam(name="message",required = false) String message) {
		return "Hello"+message;
	}
}
