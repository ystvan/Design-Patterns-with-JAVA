package com.example.java;

public class WhipCreme extends ExtrasDecorator {
    private Beverage beverage;

    public WhipCreme(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", plus Whip creme on top";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
