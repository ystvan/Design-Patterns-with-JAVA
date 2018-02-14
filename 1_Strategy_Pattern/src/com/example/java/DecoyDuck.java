package com.example.java;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Well, I look like a fake, wooden duck I guess!");
    }
}
