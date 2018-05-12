package com.example.java;

class GrillMaster {
    private HamburgerBuilder hamburgerBuilder;

    public void setHamburgerBuilder(HamburgerBuilder hb) {
        hamburgerBuilder = hb;
    }

    public Hamburger getHamburger() {
        return hamburgerBuilder.getHamburger();
    }

    public void constructHamburger() {
        hamburgerBuilder.creteNewHamburgerProduct();
        hamburgerBuilder.buildBun();
        hamburgerBuilder.buildPatty();
        hamburgerBuilder.buildSeasoning();
    }
}
