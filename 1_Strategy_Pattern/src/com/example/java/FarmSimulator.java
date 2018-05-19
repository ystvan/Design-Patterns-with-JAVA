package com.example.java;

public class FarmSimulator {

    public static void main(String[] args) {
	// write your code here
        Chicken hen = new Hen();
        hen.display();
        hen.performCluck();
        hen.performFly();
        hen.swim();

        Chicken cock = new Rooster();
        cock.display();
        cock.performCluck();
        cock.performFly();
        System.out.println("Getting some cheating");
        cock.setFlyBehavior(new FlyHotWings());
        cock.performFly();
    }
}
