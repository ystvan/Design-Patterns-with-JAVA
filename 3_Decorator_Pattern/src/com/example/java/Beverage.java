package com.example.java;

public abstract class Beverage {
    String description = "Unknown Drink";

    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
