package com.programmers.lambda;

import java.util.ArrayList;
import java.util.List;

public class Java_8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[] strings = list.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);
    }
}