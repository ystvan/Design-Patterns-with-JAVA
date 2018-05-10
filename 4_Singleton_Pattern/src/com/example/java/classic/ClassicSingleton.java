package com.example.java.classic;

public class ClassicSingleton {
    private static ClassicSingleton uniqueInstance;
    private static int howManyTimes = 0;
    private ClassicSingleton(){}
    public static ClassicSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ClassicSingleton();
            howManyTimes++;
        }
        return uniqueInstance;
    }
    public String getDescription(){
        return "I am a classic Singleton";
    }
    public String getTimesOfCreation(){
        return "This Singleton has been instantiated exactly " + howManyTimes + " time(s)";
    }
}
