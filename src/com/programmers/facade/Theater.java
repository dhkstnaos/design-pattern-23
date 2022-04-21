package com.programmers.facade;

public class Theater {
    private String name;

    public Theater(String name) {
        this.name = name;
    }

    public void openDoor() {
        System.out.println("극장 문 개방");
    }

    public void closeDoor() {
        System.out.println("극장 문 닫힘");
    }
}
