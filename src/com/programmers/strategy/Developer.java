package com.programmers.strategy;

public class Developer {
    private Strategy strategy;
    public Developer(Strategy strategy) {
        this.strategy = strategy;
    }

    public String choose() {
        return "Developer choose a tool -> " + strategy.useTool();
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
