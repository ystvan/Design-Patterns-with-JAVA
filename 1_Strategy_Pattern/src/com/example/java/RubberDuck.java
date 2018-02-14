package com.example.java;

public class RubberDuck extends Duck {
    public RubberDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("I am an old-school yellow colored rubber duck");
    }
}

