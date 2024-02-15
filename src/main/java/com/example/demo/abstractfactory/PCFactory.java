package com.example.demo.abstractfactory;

public class PCFactory implements ComputerAbstractFactory {
    private String ram;
    private String hdd;
    private String cpu;
    private String os;

    public PCFactory(String ram, String hdd, String cpu, String os) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.os = os;
    }

    @Override
    public Computer buildComputer() {
        return new PC(ram, hdd, cpu, os);
    }
}
