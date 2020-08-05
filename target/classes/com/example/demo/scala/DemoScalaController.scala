package com.example.demo.scala;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/scala")
public class DemoScalaController {

	@GetMapping(path = Array("/greet"))
    def demo={
      "Hello from Java Surbhi"
    }

}
