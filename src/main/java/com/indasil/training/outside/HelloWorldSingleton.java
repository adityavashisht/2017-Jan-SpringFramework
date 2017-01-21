package com.indasil.training.outside;

/**
 * Created by Ady on 1/21/17.
 */
public class HelloWorldSingleton {

    private static final HelloWorldSingleton instance = new HelloWorldSingleton();

    private HelloWorldSingleton() {
    }

    public static HelloWorldSingleton getInstance() {
        return instance;
    }

}
