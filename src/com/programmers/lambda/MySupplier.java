package com.programmers.lambda;

@FunctionalInterface
public interface MySupplier<T> {
    T supply();
}
