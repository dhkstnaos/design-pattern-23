package com.programmers.collection;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        new MyCollection<User>(Arrays.asList(
                        new User(15,"AAA"),
                        new User(16,"BBB"),
                        new User(25,"CCC"),
                        new User(15,"DDD"),
                        new User(45,"EEE"),
                        new User(15,"FFF"),
                        new User(65,"GGG"),
                        new User(15,"HHH")
                )
        )
                .filter(User::isOver19)
                .foreach(System.out::println);
    }
}
