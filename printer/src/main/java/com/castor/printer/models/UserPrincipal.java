package com.castor.printer.models;

import com.castor.printer.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "user_principal")
public class UserPrincipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int userId;

    @Column(unique = true, nullable = false)
    String email;

    @Column(nullable = false)
    String passHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Roles role;

    @Column
    Timestamp createdAt;

    @OneToOne(mappedBy = "userPrincipal",  cascade = CascadeType.ALL, orphanRemoval = true)
    private UserPersonal userPersonal;
}
