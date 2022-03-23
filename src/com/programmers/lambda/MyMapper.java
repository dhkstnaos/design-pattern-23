package com.programmers.lambda;

@FunctionalInterface
public interface MyMapper<IN, OUT> {
    OUT map(IN s);
}
