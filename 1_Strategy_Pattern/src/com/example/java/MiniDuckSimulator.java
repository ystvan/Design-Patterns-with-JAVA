package com.example.java;

public class MiniDuckSimulator {

    public static void main(String[] args) {
	// write your code here
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();
        System.out.println("Getting some cheating");
        decoy.setFlyBehavior(new FlyRocketPowered());
        decoy.performFly();
    }
}
