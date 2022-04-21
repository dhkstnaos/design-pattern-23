package com.programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();
        double pow = Math.pow(1, 2);
        Set<Integer> tree=new TreeSet<>();
        Iterator<Integer> iterator = tree.iterator();
        for (Iterator<Integer> it = iterator; it.hasNext(); ) {
            int i = it.next();
        }
        int a=5;
        int b=3;
        boolean b1 = a == b;
        String result = "Hello.:he.lldf// and dklckl";
        String trim = result.trim();
        String s = trim.toLowerCase();
        String[] split = s.split("[.]");
        for(String str: split) System.out.println("str = " + str);
        String exam = "Hello.:he.lldf// and dklckl";
        String change = exam.replaceAll("[:]", "change");
        boolean hello = change.contains("Hello");
        System.out.println("hello = " + hello);
        System.out.println("change = " + change);
        StringBuilder sb= new StringBuilder();
        sb.append(1);
        System.out.println("sb = " + sb);
        sb.insert(1,"hook");
        System.out.println("sb = " + sb);
        sb.setCharAt(1,'2');
        System.out.println("sb = " + sb);
        char ch= 'a';
        String s1 = String.valueOf(ch);
        List<Integer> listss = new ArrayList<>();
        Integer[] integers = listss.stream().toArray(Integer[]::new);
    }
}

