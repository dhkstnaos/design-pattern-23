package com.programmers.collection;

public class User {
    public static User EMPTY = new User(0,"");
    private int age;
    private String name;

    public User(int age,String name) {
        this.age=age;
        this.name=name;
    }
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    public boolean isOver19() {
        return age>=19;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
