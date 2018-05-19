package com.example.java;

public class Hen extends Chicken {
    public Hen(){
        cluckBehavior = new FemaleCluck();
        flyBehavior = new FlyWithOwnWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real happy chicken living in the countryside");
    }
}
