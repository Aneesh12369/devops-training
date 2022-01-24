package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	
	@GetMapping("/message")
	public String message(@RequestParam("message") String message) {
		return message;
	}
	
}
