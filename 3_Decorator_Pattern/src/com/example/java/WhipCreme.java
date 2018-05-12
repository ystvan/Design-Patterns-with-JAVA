package com.example.java;

public class WhipCreme extends CondimentDecorator {
    Beverage beverage;

    public WhipCreme(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip creme on top";
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }
}
