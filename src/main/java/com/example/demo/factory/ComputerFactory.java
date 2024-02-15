package com.example.demo.factory;

public class ComputerFactory {

    public static Computer buildComputer(String type, String ram, String hdd, String cpu, String os) {
        if (type.equalsIgnoreCase("pc")) {
            return new PC(ram, hdd, cpu, os);
        }
        if (type.equalsIgnoreCase("server")) {
            return new Server(ram, hdd, cpu, os);
        }
        if (type.equalsIgnoreCase("laptop")) {
            return new Laptop(ram, hdd, cpu, os);
        }
        return null;
    }
}
