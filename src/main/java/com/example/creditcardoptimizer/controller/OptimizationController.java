package com.example.creditcardoptimizer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OptimizationController {

    @GetMapping("/credit-card/feedback")
    public ResponseEntity<Object> getFeedBack(){


        return null;
    }
}

