package com.example.demo.controllers;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@SpringBootApplication
public class HomeController {
	@GetMapping("/")
	public String message() {
		return"---------Hello Spring Boot App------------";
	}
	
    @GetMapping("/Bienvenidoo")
    public String nombre(@RequestParam(value = "name", defaultValue = "jhon andres pinto")String name){
      return String.format("Bienvenido %s", name);
    }
}
    
