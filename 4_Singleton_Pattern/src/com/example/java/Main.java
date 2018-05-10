package com.example.java;

import com.example.java.classic.ClassicSingleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ClassicSingleton classicSingleton = ClassicSingleton.getInstance();
        System.out.println(classicSingleton.getDescription());
        System.out.println(classicSingleton.getTimesOfCreation());

        ClassicSingleton anotherOne = ClassicSingleton.getInstance();
        System.out.println(anotherOne.getTimesOfCreation());

        ClassicSingleton extraOne = ClassicSingleton.getInstance();
        System.out.println(extraOne.getTimesOfCreation());

    }
}
