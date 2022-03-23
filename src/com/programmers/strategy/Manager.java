package com.programmers.strategy;

public class Manager {
    public static void main(String[] args) {
        Developer developer = new Developer(new StrategyEclipse());
        System.out.println(developer.choose());
        developer.setStrategy(new StrategyIntelij());
        System.out.println(developer.choose());
    }
}
