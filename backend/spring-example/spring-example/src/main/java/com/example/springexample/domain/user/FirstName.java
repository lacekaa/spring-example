package com.example.springexample.domain.user;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class FirstName {
    private String firstName;

    public FirstName(String firstName) {
        this.firstName = firstName;
    }

    protected FirstName() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FirstName firstName1 = (FirstName) o;
        return Objects.equals(firstName, firstName1.firstName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName);
    }

    @Override
    public String toString() {
        return "FirstName{" +
                "firstName='" + firstName + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }
}

