package com.example.springexample.domain.user;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Lastname {

    private String lastName;

    public Lastname(String lastName){
        this.lastName = lastName;
    }

    protected Lastname(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lastname lastname = (Lastname) o;
        return Objects.equals(lastName, lastname.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName);
    }

    @Override
    public String toString() {
        return "Lastname{" +
                "lastName='" + lastName + '\'' +
                '}';
    }

    public String getLastName() {
        return lastName;
    }
}
