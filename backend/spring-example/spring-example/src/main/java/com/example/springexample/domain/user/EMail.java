package com.example.springexample.domain.user;

import jakarta.persistence.Embeddable;

@Embeddable
public class EMail {

    private Username username;

    protected EMail() {
        // for JPA
    }

    public EMail(Username username) {
        this.username = username;
    }
}
