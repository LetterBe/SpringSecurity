package de.neuefische.spring.security.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")


public class GreetingController {
    @GetMapping
    public String greet (){
        return "Willkommen bei der Seite!";
    }
}
