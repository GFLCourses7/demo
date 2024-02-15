package com.example.demo.factory;

public class Laptop extends Computer {
    private String ram;
    private String hdd;
    private String cpu;
    private String os;

    public Laptop(String ram, String hdd, String cpu, String os) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
        this.os = os;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }

    @Override
    public String getOS() {
        return this.os;
    }
}
