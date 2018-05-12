package com.example.java;

abstract class HamburgerBuilder {
    protected Hamburger hamburger;

    public Hamburger getHamburger() {
        return hamburger;
    }

    public void creteNewHamburgerProduct() {
        hamburger = new Hamburger();
    }

    public abstract void buildBun();
    public abstract void buildPatty();
    public abstract void buildSeasoning();
}
