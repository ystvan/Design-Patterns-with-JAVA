package com.example.java;

public class FlatExoticExpensive extends Beverage {
    public FlatExoticExpensive() {
        description = "You are getting a special coffee drink: came from a far way country, bio coffee beans are harvested by happy and organic farmers";
    }

    @Override
    public double cost() {
        return 42.90;
    }
}
