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
        when(exampleRepository.sum(anyInt(), anyInt())).thenReturn(10);
        ExampleService exampleService = new ExampleService(exampleRepository);
        int math = exampleService.math(5, 5);
        assertEquals(20, math);
    }

    @Test
    void mathSecond() {
        when(exampleRepository.sum(anyInt(), anyInt())).thenReturn(10);
        ExampleService exampleService = new ExampleService(exampleRepository);
        int math = exampleService.math(10, 5);
        assertEquals(20, math);
    }
}
