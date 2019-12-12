package com.beloll.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class HystrixController {

    @GetMapping("/service")
    public String serviceFallback() {
        return "Service is not available now.";
    }
}
