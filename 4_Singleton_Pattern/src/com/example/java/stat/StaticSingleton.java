package com.example.java.stat;

public class StaticSingleton {
    private static StaticSingleton uniqueInstance = new StaticSingleton();
    private StaticSingleton(){}
    public static StaticSingleton getInstance(){
        return uniqueInstance;
    }
    public String getDescription(){
        return "I am a statically initialized Singleton";
    }
}
