package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final Calculator calculator = new Calculator();

    @GetMapping("/")
    public String home() {
        return "Welcome to the Java Calculator Application!";
    }

    @GetMapping("/add")
    public String add(@RequestParam int num1,
                      @RequestParam int num2) {

        int result = calculator.add(num1, num2);

        return "The sum of " + num1 + " and " + num2 + " is: " + result;
    }
}