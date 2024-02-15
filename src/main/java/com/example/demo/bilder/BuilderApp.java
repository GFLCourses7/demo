package com.example.demo.bilder;

public class BuilderApp {
    public static void main(String[] args) {

        ComputerDesign build = new ComputerBuilder(1000, 16)
                .setNetwork(true)
                .build();

        System.out.println(build);
    }
}
