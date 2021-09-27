package com.company.calculatorbe;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
@Api(value="Calculator", tags = {"REST API for Calculator"})
public class CalcController {

	@ApiOperation(value = "Addition", notes = "Add two numbers")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Sum"),
			@ApiResponse(code = 500, message = "Oops!!!")
	})
	@GetMapping("/add/{num1}/{num2}")
	public int add(@PathVariable @ApiParam(example = "12") int num1,
				   @PathVariable @ApiParam(example = "10") int num2) {
		return num1 + num2;
	}

	@ApiOperation(value = "Subtraction", notes = "Subtract two numbers")
	@ApiResponses({
			@ApiResponse(code = 200, message = "Sum"),
			@ApiResponse(code = 500, message = "Oops!!!")
	})
	@GetMapping("/sub/{num1}/{num2}")
	public int sub(@PathVariable @ApiParam(example = "12") int num1,
				   @PathVariable @ApiParam(example = "10") int num2) {
		return num1 - num2;
	}

}
