package com.company.calculatorbe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable int num1, @PathVariable int num2) {
		return num1 + num2;
	}

	@GetMapping("/sub/{num1}/{num2}")
	public int sub(@PathVariable int num1, @PathVariable int num2) {
		return num1 - num2;
	}

}
