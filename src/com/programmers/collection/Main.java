package com.programmers.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        List<Integer> list2=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        
        for(int i=0;i<list.size();i++) {
            System.out.println("list.get(i) = " + list.get(i));
        }

        list.forEach(System.out::println);

        new MyCollection<>(Arrays.asList(1,2,3,4,5))
                .foreach(System.out::println);

        MyCollection<String> c1 = new MyCollection<>(Arrays.asList("A", "Bc", "Cdd", "Deee", "Eeeee"));
        MyCollection<Integer> c2= c1.map(String::length);
        c2.foreach(System.out::println);

        //축약
        new MyCollection<>(Arrays.asList("A", "Bc", "Cdd", "Deee", "Eeeee"))
                .map(String::length)
                .foreach(System.out::println);

        //filter
        new MyCollection<>(Arrays.asList("A", "Bc", "Cdd", "Deee", "Eeeee"))
                .map(String::length)
                .filter(i->i%2==1)
                .foreach(System.out::println);

        new MyCollection<>(Arrays.asList("A", "Bc", "Cdd", "Deee", "Eeeee"))
                .map(String::length)
                .filter(i -> i % 2 == 1)
                .size();
    }
}
