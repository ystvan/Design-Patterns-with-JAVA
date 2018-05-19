package com.example.java.classic;

public class RegistryConfiguration {
    private static RegistryConfiguration uniqueInstance;
    private static int howManyTimes = 0;
    private String name;
    private RegistryConfiguration(String name){
        this.name = name;
        howManyTimes++;
    }
    public static RegistryConfiguration getInstance(String name){
        if (uniqueInstance == null){
            uniqueInstance = new RegistryConfiguration(name);
        }
        return uniqueInstance;
    }
    public String getDescription(){
        return "Setting your kernel, device drivers and security. Registry name is: " + name;
    }
    public String getTimesOfCreation(){
        return "This Configuration of your system's registry has been instantiated exactly " + howManyTimes + " time(s)";
    }
}
