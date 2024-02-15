package com.example.demo.mock;

import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    private final ExampleRepository exampleRepository;

    public ExampleService(ExampleRepository exampleRepository) {
        this.exampleRepository = exampleRepository;
    }

    public int math(int a, int b) {
        int sum = exampleRepository.sum(a, b);
        sum = sum * 2;
        return sum;
    }
}
