package com.indasil.training.outside;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ady on 1/21/17.
 */
public class HelloWorld {


    private String message;
    private boolean canSing;

    private static final List<Person> personList = new ArrayList<Person>();

    private static List<Person> another = new ArrayList<Person>();

    static {
        personList.add(new Person("Aditya"));
        personList.add( new Person("Himasnh"));

    }



    public HelloWorld() {}

    public HelloWorld(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HelloWorld that = (HelloWorld) o;

        return message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return message.hashCode();
    }
}
