package com.demo;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;

@RestController
public class Controller {
    @PostMapping("/register")
    public String reg(@Valid @RequestBody User user) {
        return "Valid User Registered!";
    }
}
