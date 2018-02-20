package com.example.java;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso classic";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
