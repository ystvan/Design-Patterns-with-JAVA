package com.example.java;

class CheeseburgerBuilder extends HamburgerBuilder {
    public void buildBun() {
        hamburger.setBun("default");
    }

    public void buildPatty() {
        hamburger.setPatty("beef");
    }

    public void buildSeasoning() {
        hamburger.setSeasoning("cheese on top");
    }
}