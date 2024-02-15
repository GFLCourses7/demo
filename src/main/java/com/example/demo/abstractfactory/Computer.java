package com.example.demo.abstractfactory;

public abstract class Computer {

    public abstract String getRam();

    public abstract String getHDD();

    public abstract String getCPU();

    public abstract String getOS();

    public String toString() {
        return "RAM = " + getRam() + "; HDD = " + getHDD() + "; CPU = " + getCPU() + "; OS = " + getOS();
    }
}
