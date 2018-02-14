package com.example.java;

public class RedHeadDuck extends Duck {
    public RedHeadDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I am a real red headed duckling!");
    }
}
