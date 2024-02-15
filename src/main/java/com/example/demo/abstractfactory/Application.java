package com.example.demo.abstractfactory;

public class Application {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.buildComputer(new PCFactory("16", "1T", "2.4Gh", "Win"));
        Computer server = ComputerFactory.buildComputer(new ServerFactory("32", "1T", "2.4Gh", "Linux"));
        Computer laptop = ComputerFactory.buildComputer(new LaptopCustomFactory("16", "1T"));
        System.out.println("PC - " + pc);
        System.out.println("Server - " + server);
        System.out.println("Laptop - " + laptop);
    }
}
