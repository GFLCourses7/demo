package com.example.demo.singleton;

public class Singleton {
    private static Singleton instance;
    private String value;

    static {
        instance = new Singleton("Test 3");
    }

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.value = value;
    }

    public static synchronized Singleton getInstance(String value) {

        return instance;
    }

    public String getValue() {
        return value;
    }
}
