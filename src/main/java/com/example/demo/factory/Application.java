package com.example.demo.factory;

public class Application {

    public static void main(String[] args) {
        Computer pc = ComputerFactory.buildComputer("pc", "16", "1T", "2.4Gh", "Win");
        Computer server = ComputerFactory.buildComputer("server", "32", "1T", "2.4Gh", "Linux");
        Computer laptop = ComputerFactory.buildComputer("laptop", "16", "1T", "2.4Gh", "Win");
        System.out.println("PC - " + pc);
        System.out.println("Server - " + server);
        System.out.println("Laptop - " + laptop);
    }
}
