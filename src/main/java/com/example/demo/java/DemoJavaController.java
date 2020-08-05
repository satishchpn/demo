package com.example.demo.java;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/java")
public class DemoJavaController {

	@GetMapping("/greet")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello from Java Surbhi", HttpStatus.OK);
	}

}
