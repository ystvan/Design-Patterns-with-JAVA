package com.example.java;

public class Hamburger {
    private String bun = "";
    private String patty = "";
    private String seasoning = "";

    public void setBun(String bun) {
        this.bun = bun;
    }

    public void setPatty(String patty) {
        this.patty = patty;
    }

    public void setSeasoning(String seasoning) {
        this.seasoning = seasoning;
    }

    @Override
    public String toString() {
        return "I am eating a delicious hamburger, whose bun is: " + bun + " with some patty of " + patty + " and seasoning(s) is/are " + seasoning;
    }
}
