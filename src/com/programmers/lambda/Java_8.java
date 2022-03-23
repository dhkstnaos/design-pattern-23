package com.programmers.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java_8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        String[] strings = list.stream()
                .map(String::toUpperCase)
                .toArray(String[]::new);

        int[] num = {1, 2, 3};

        Integer[] result = Arrays.stream(num)
                .map(x -> x*x)
                .boxed()
                .toArray(Integer[]::new);

        for (Integer n : result) {
            System.out.println(n);
        }
        //스트림 병렬처리
        List<String> list2 =
                Arrays.asList("a", "a", "cdfas", "dgg", "e", "fhh", "g", "h", "i");
        //Filter 사용
        list2.stream().filter(e -> e.length()<2).forEach(System.out::println);
        //distinct 사용
        list2.stream().distinct().forEach(System.out::println);
        //map 사용
        list2.stream().map(e->e.length()).forEach(System.out::println);

        //flatmap
        String[] arr = {"I study hard", "You study JAVA", "I am hungry"};
        String[] s1 = Arrays.stream(arr)
                .flatMap(s -> Stream.of(s.split(" ")))
                .toArray(String[]::new);
        List<String> collect = Arrays.stream(arr)
                .flatMap(s -> Stream.of(s.split(" ")))
                .collect(Collectors.toList());
        List<String> uniqueCharacters = list2
                .stream()
                .map(w -> w.split("")) // 각 단어를 개별 문자를 포함하는 배열로 변환 
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());
        // 생성된 스트림을 하나의 스트림으로 평면화


    }
}