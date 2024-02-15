package com.example.demo.singleton;

public class SingletonApp {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadOne());
        Thread threadSecond = new Thread(new ThreadTwo());
        thread.start();
        threadSecond.start();
    }

    static class ThreadOne implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Test1");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadTwo implements Runnable {

        @Override
        public void run() {
            Singleton singleton = Singleton.getInstance("Test2");
            System.out.println(singleton.getValue());
        }
    }
}
