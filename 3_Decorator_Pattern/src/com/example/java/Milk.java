package com.example.java;

public class Milk extends ExtrasDecorator {
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", and Milk";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
