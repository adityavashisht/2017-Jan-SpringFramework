package com.indasil.training.spring;

import com.indasil.training.outside.HelloWorld;
import com.indasil.training.outside.HelloWorldImmutable;
import com.indasil.training.outside.HelloWorldSingleton;

/**
 * Created by Ady on 1/21/17.
 */
public class Driver {

    public static void main(String[] args) {

        HelloWorld helloWorld = new HelloWorld("Hi There");
        helloWorld.setMessage("Not me");

        HelloWorldImmutable helloWorldImmutable = new HelloWorldImmutable("Aditya");

        HelloWorldSingleton singleton = HelloWorldSingleton.getInstance();

        System.out.println(helloWorld);
    }
}
