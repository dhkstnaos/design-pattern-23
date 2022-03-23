package com.programmers.lambda;

@FunctionalInterface
public interface MyConsumer<T> {
    void consume(T t);
}
