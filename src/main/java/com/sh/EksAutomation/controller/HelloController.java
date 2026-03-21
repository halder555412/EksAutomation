package com.sh.EksAutomation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/test")
    public String home() {
        return "Hello from EksAutomation test AWS deployment";
    }
}
