package com.example.java;

public class Pizza {
    private String dough = "";
    private String sauce = "";
    private String topping = "";

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    @Override
    public String toString() {
        return "I am eating a delicious pizza, whose dough is: " + dough + " with some sauce of " + sauce + " and topping(s) is/are " + topping;
    }
}
