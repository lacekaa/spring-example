package com.example.springexample.domain.user;

import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class Username {

    private String username;

    public Username(String username){
        this.username = username;
    }
    protected Username(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Username username1 = (Username) o;
        return Objects.equals(username, username1.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }

    @Override
    public String toString() {
        return "Username{" +
                "username='" + username + '\'' +
                '}';
    }

    public String getUsername() {
        return username;
    }
}
