package com.example.ind11spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    // /calculator

    @GetMapping("/calculator")
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }
}


