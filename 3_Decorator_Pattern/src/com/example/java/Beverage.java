package com.example.java;

public abstract class Beverage {
    String description = "Unknown Beverage, never seen this fgs";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
