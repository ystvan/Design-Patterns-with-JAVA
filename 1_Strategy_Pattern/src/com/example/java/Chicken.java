package com.example.java;

public abstract class Chicken {
    FlyBehavior flyBehavior;
    CluckBehavior cluckBehavior;

    public Chicken(){

    }

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }
    public void performCluck(){
        cluckBehavior.cluck();
    }
    public void swim(){
        System.out.println("All chicken float, even the bald ones!");
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }
    public void setCluckBehavior(CluckBehavior cb){
        cluckBehavior = cb;
    }

}
