package com.indasil.training.outside;

/**
 * Created by Ady on 1/21/17.
 */
public class Person {

    private String first;

    public Person(String first) {
        this.first = first;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return first != null ? first.equals(person.first) : person.first == null;
    }

    @Override
    public int hashCode() {
        return first != null ? first.hashCode() : 0;
    }
}
