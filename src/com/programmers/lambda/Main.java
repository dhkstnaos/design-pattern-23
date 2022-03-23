package com.programmers.lambda;

public class Main {
    public static void main(String[] args) {
        new MyRunnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }.run();
        MyRunnable r = () -> {
            System.out.println("Custom Hello");
        };
        r.run();
        MyRunnable r2 = () -> System.out.println("More Custom Hello");
        r2.run();
        MyRunnable r3 = () -> {
            MySupply s2 = () -> "Hello MySupply";
            System.out.println(s2.supply());
        };
        r3.run();
    }
}