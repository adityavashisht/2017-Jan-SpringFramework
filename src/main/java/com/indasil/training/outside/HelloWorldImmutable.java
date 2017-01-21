package com.indasil.training.outside;

/**
 * Created by Ady on 1/21/17.
 */
public final class HelloWorldImmutable {

    private final String message;

    public HelloWorldImmutable(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }




    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }




}
