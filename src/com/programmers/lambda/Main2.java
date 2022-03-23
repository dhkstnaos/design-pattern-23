package com.programmers.lambda;

public class Main2 {
    public static void main(String[] args) {
        int sum=0;
        new Main2().loop(10, System.out::println);
    }
    void loop(int n, MyConsumer<Integer> consumer) {
        for(int i=0;i<n;i++) {
            consumer.consume(i);
       }
    }
}
