package com.example.java.threadsafe;

public class ThreadsafeSingleton {
    private static ThreadsafeSingleton uniqueInstance;
    public static synchronized ThreadsafeSingleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new ThreadsafeSingleton();
        }
        return uniqueInstance;
    }
    public String getDescription(){
        return "I am a thread safe Singleton!";
    }
}
