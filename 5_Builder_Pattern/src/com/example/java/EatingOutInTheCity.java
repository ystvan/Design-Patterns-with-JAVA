package com.example.java;

public class EatingOutInTheCity {
    public static void main(String[] args) {
        GrillMaster chef = new GrillMaster();
        HamburgerBuilder veganHamburgerBuilder = new VeganHamburgerBuilder();
        HamburgerBuilder cheeseburgerBuilder = new CheeseburgerBuilder();

        chef.setHamburgerBuilder( veganHamburgerBuilder );
        chef.constructHamburger();
        Hamburger hamburger1 = chef.getHamburger();

        //eat it
        System.out.println(hamburger1);

        chef.setHamburgerBuilder( cheeseburgerBuilder );
        chef.constructHamburger();
        Hamburger hamburger2 = chef.getHamburger();

        //eat it
        System.out.println(hamburger2);

    }
}
