package com.example.demo.scala;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scala")
public class DemoScalaController {

	@GetMapping("/greet")
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>("Hello from Scala Surbhi", HttpStatus.OK);
	}

}
