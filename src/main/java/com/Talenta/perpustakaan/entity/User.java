package com.Talenta.perpustakaan.entity;

import ch.qos.logback.classic.db.names.ColumnName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.relation.Role;
import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = {@UniqueConstraint(columnNames={"username"})})
@Setter
@Getter
@NoArgsConstructor
public class User extends BaseEntity<User> {
    public enum Role{
        ROLE_USER,
        ROLE_ADMIN
    }

    @Column(name = "role", columnDefinition = "VARCHAR(50)")
    @Enumerated(EnumType.STRING)
    private Role role = Role.ROLE_USER;

    @Column(name = "profile_name", columnDefinition = "VARCHAR(100)", nullable = false )
    private String profileName;

    @Column(name = "username", columnDefinition = "VARCHAR (50)", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "address")
    private String address;

    @Column(name = "token")
    private String token;

    public User(String Username){
        this.username = username;
    }
}
