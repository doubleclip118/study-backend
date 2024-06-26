package com.backend.apptive.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter
@NoArgsConstructor()
public class User {

    public User(String email, String name) {
        this.email = email;
        this.name = name;
    }

    @Id
    @Column(nullable = false,unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    public User withName(String newName) {
        return new User(this.email, newName);
    }
}
