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

        MySupplier<String> s = new MySupplier() {
            @Override
            public String supply() {
                return "Hello World";
            }
        };
        // 한 줄로 줄인다.
        MySupplier<String> s2 = () -> "Hello world";

        MyMapper<String,Integer> m = String::length;
        MyMapper<Integer,Integer> m2 = i -> i * i;
        MyMapper<Integer,String> m3 = Integer::toHexString;
        MyConsumer<String> c = System.out::println;

        m3.map(
                m2.map(
                        m.map(
                                s.supply()
                        )));
        MyRunnable rn = () ->
                m3.map(
                        m2.map(
                                m.map(
                                        s.supply())));
        r.run();
        //들어온 인자 값을 바로 사용할 경우 메소드 레퍼런스
        //MyMapper m2 = String::length;

        MyConsumer c2 = System.out::println;
    }
}