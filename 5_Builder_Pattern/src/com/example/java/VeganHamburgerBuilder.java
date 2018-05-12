package com.example.java;

class VeganHamburgerBuilder extends HamburgerBuilder {
    public void buildBun() {
        hamburger.setBun("poppy seed");
    }

    public void buildPatty() {
        hamburger.setPatty("veggie patty");
    }

    public void buildSeasoning() {
        hamburger.setSeasoning("ketchup and mayo");
    }
}
