package de.neuefische.spring.security.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api/admin")
public class SecondGreetingController {

    @GetMapping
    public String greet(Principal principal){
        return "Servus, lieber Gast !";
    }

}
