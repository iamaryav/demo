package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("/printSomething")
    public String getValue() {
        log.info("Hello, World!");
        return "Hello, World";
    }

}
