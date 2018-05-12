package com.example.java;

public class HipsterCoffeeShop {

    public static void main(String[] args) {
        // write your code here
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Milk(beverage2);
        beverage2 = new WhipCreme(beverage2);

        System.out.println(beverage2.getDescription()
        + " $" + beverage2.cost());

    }
}
