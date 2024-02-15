package com.example.demo.mock;

import org.springframework.stereotype.Component;

@Component
public class ExampleRepository {

    public int sum(int a, int b) {
        return a + b;
    }
}
