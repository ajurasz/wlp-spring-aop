package com.example.demo;

import org.springframework.stereotype.Service;

@Service
class HelloService
{
    String sayHello(String to)
    {
        return String.format("Hello, %s", to);
    }
}
