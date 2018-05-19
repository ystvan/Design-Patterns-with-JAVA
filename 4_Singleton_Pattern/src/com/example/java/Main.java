package com.example.java;

import com.example.java.classic.RegistryConfiguration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RegistryConfiguration registryConfiguration = RegistryConfiguration.getInstance("first");
        System.out.println(registryConfiguration.getDescription());
        System.out.println(registryConfiguration.getTimesOfCreation());

        RegistryConfiguration anotherOne = RegistryConfiguration.getInstance("second");
        System.out.println(anotherOne.getDescription());
        System.out.println(anotherOne.getTimesOfCreation());

        RegistryConfiguration extraOne = RegistryConfiguration.getInstance("third");
        System.out.println(extraOne.getDescription());
        System.out.println(extraOne.getTimesOfCreation());

    }
}
