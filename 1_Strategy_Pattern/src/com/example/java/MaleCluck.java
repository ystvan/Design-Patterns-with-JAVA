package com.example.java;

public class MaleCluck implements CluckBehavior {
    @Override
    public void cluck() {
        System.out.println("Cock-a-the-dawn, cock-a-doodle-do");
    }
}
