package dev.coffeedev.first_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    @GetMapping("/api/message")
    @ResponseBody
    public String message() {
        return "Hello from @ResponseBody endpoint!";
    }

    @GetMapping("/greeting")
    public String greeting() {
        return "greeting";
    }
}

