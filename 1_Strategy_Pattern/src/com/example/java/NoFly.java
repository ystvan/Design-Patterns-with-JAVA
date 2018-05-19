package com.example.java;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly, my wings are cut off, so I could put on a fight with other roosters safely!");
    }
}
