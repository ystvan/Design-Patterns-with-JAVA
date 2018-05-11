package com.example.java;

import com.example.java.classic.RegistryConfiguration;

public class Main {

    public static void main(String[] args) {
	// write your code here
        RegistryConfiguration registryConfiguration = RegistryConfiguration.getInstance();
        System.out.println(registryConfiguration.getDescription());
        System.out.println(registryConfiguration.getTimesOfCreation());

        RegistryConfiguration anotherOne = RegistryConfiguration.getInstance();
        System.out.println(anotherOne.getTimesOfCreation());

        RegistryConfiguration extraOne = RegistryConfiguration.getInstance();
        System.out.println(extraOne.getTimesOfCreation());

    }
}
