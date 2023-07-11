package com.example.ind11spring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
  private final CalculatorService service;

    public CalculatorController(CalculatorService service) {
        this.service = service;
    }

    @GetMapping("/calculator")
    public String hello() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + service.plus(num1, num2);
    }
    @GetMapping("/calculator/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + service.minus(num1, num2);
    }
    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + service.multiply(num1, num2);
    }
    @GetMapping("/calculator/divide")
    public String divide(@RequestParam int num1, @RequestParam int num2) {
        if(num2 == 0){
            return "На ноль делить нельзя";
        }
        return num1 + " / " + num2 + " = " + service.divide(num1, num2);
    }
}


