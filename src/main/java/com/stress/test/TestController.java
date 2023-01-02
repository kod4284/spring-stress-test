package com.stress.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/health")
    public String checkHealth() throws InterruptedException {
        Thread.sleep(100);
        return "OK!";
    }
}
