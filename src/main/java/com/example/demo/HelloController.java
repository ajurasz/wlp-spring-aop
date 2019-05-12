package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
class HelloController {
    private final HelloService helloService;

    HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello/{name}")
    ResponseEntity<String> hello(@PathVariable("name") String name) {
        return ResponseEntity.ok(helloService.sayHello(name));
    }
}
