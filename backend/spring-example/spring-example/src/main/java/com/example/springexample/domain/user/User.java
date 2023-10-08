package com.example.springexample.domain.user;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.UUID;

@Entity
public class User {

    @Id
    @Column(name = "USER_ID")
    private UUID id = UUID.randomUUID();

    @Embedded
    private FirstName firstName;

    @Embedded
    private Lastname lastname;

    @Embedded
    private EMail eMail;

    @Embedded
    private Username username;

    public FirstName getFirstName() {
        return firstName;
    }

    public void setFirstName(FirstName firstName) {
        this.firstName = firstName;
    }

    public Lastname getLastname() {
        return lastname;
    }

    public void setLastname(Lastname lastname) {
        this.lastname = lastname;
    }

    public UUID getId() {
        return id;
    }

    public EMail geteMail() {
        return eMail;
    }

    public Username getUsername() {
        return username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(firstName, user.firstName) && Objects.equals(lastname, user.lastname) && Objects.equals(eMail, user.eMail) && Objects.equals(username, user.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastname, eMail, username);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName=" + firstName +
                ", lastname=" + lastname +
                ", eMail=" + eMail +
                ", username=" + username +
                '}';
    }
}
