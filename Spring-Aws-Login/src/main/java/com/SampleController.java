package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "aws")
	public String sayHello() {
		return "Welcome to Spring boot with AWS";
	}
}
