package com.example.java.classic;

public class RegistryConfiguration {
    private static RegistryConfiguration uniqueInstance;
    private static int howManyTimes = 0;
    private RegistryConfiguration(){
        howManyTimes++;
    }
    public static RegistryConfiguration getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new RegistryConfiguration();
        }
        return uniqueInstance;
    }
    public String getDescription(){
        return "Setting your kernel, device drivers and security";
    }
    public String getTimesOfCreation(){
        return "This Configuration of your system's registry  has been instantiated exactly " + howManyTimes + " time(s)";
    }
}
