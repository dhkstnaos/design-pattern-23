package com.programmers.facade;

public class Beverage {

    private String name;

    public Beverage(String name)
    {
        this.name = name;
    }

    public void prepare()
    {
        System.out.println(name+" 음료 준비 완료 ");
    }

}
