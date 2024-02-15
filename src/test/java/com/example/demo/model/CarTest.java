package com.example.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    private Car carFirst;
    private Car carSecond;

    @BeforeEach
    public void init() {
        carFirst = new Car("SUV", "White", 2);
        carSecond = new Car();
        carSecond.setType("SUV");
        carSecond.setColor("White");
        carSecond.setEngine(2);
    }

    @Test
    public void test() {
        System.out.println("Test message 2");
        assertEquals(carFirst, carSecond);
    }

}
