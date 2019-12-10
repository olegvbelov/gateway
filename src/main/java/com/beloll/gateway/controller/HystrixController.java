package com.beloll.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fallback")
public class HystrixController {

    @GetMapping("/photo-service")
    public String photoServiceFallback() {
        return "Photo-service is not available now.";
    }
}
