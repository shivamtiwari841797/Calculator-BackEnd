package com.company.calculatorbe.profiles;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {
    @Value("${welcome.env}")
    private String env;

    @GetMapping("/welcome")
    public  String welcome() {
        return "Welcome to " + env;
    }
}
