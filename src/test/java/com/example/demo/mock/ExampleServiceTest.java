package com.example.demo.mock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ExampleServiceTest {

    private ExampleRepository exampleRepository = mock(ExampleRepository.class);

    @Test
    void math() {
        when(exampleRepository.sum(5, 5)).thenReturn(10);
        ExampleService exampleService = new ExampleService(exampleRepository);
        int math = exampleService.math(5, 5);
        assertEquals(20, math);
    }
}