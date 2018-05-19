package com.example.java;

public class Rooster extends Chicken {
    public Rooster(){
        cluckBehavior = new MaleCluck();
        flyBehavior = new NoFly();
    }

    @Override
    public void display() {
        System.out.println("I am an old-school rooster, king of the yard");
    }
}

