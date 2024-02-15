package com.example.demo.abstractfactory;

public class ComputerFactory {

    public static Computer buildComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.buildComputer();
    }
}
