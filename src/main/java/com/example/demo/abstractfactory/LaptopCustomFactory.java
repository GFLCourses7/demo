package com.example.demo.abstractfactory;

public class LaptopCustomFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;

    public LaptopCustomFactory(String ram, String hdd) {
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer buildComputer() {
        return new Laptop(ram, hdd, "M1", "MacOS");
    }
}
