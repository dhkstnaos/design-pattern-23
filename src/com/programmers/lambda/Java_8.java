package com.programmers.lambda;

import java.util.*;
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
                .map(x -> x * x)
                .boxed()
                .toArray(Integer[]::new);

        for (Integer n : result) {
            System.out.println(n);
        }
        //스트림 병렬처리
        List<String> list2 =
                Arrays.asList("adcf", "adce", "acea", "acda", "e", "fhh", "g", "h", "i");
        //Filter 사용
        list2.stream().filter(e -> e.length() < 2).forEach(System.out::println);
        //distinct 사용
        list2.stream().distinct().forEach(System.out::println);
        //map 사용
        list2.stream().map(e -> e.length()).forEach(System.out::println);

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
                // 생성된 스트림을 하나의 스트림으로 평면화
                .flatMap(Arrays::stream)
                .distinct().collect(Collectors.toList());

        //limit
        List<String> collect1 = list2.stream()
                .limit(5)
                .collect(Collectors.toList());
        //skip
        list2.stream()
                .skip(5)
                .collect(Collectors.toList());

        //sorted
        list2.stream().sorted()
                .forEach(s -> System.out.print(s + " "));
        System.out.println();
        list2.stream().sorted(Comparator.reverseOrder())
                .forEach(s -> System.out.print(s + " "));

        //SummaryStatistics
        List<String> langs =
                Arrays.asList("java", "kotlin", "haskell", "ruby", "javascript");
        IntSummaryStatistics stats = langs.stream()
                .mapToInt((lang) -> (lang.length()))
                .summaryStatistics();

        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Average: " + stats.getAverage());
        System.out.println("Count: " + stats.getCount());

        List<String> langs2 =
                Arrays.asList("java", "kotlin", "haskell", "ruby", "javascript");
        HashSet<Object> collect2 = langs2.stream().collect(HashSet::new, HashSet::add, HashSet::addAll);
        Set<String> collect3 = langs.stream().collect(Collectors.toSet());
        List<String> collect4 = langs.stream().collect(Collectors.toList());
        //하나의 string으로 합치기
        String collect5 = langs2.stream().collect(Collectors.joining(", "));

        //string의 길이를 변환해 평균을 구한다.
        Double collect6 = langs2.stream().map(String::length).collect(Collectors.averagingInt(v -> v * 2));
        //리스트를 map으로 변환
        Map<String, Integer> collect7 = langs2.stream().collect(Collectors.toMap(String::toUpperCase, String::length));

        //내림차순 정렬
        //Arrays.sort(arr,(x,y)->y-x);
        final Comparator<Integer> comp1 = (ss1, ss2) -> ss2.compareTo(ss1);
        //count,min,max
        int max = langs2.stream().map(String::length).min(comp1).get();
        System.out.println("max: "+max);
    }
}