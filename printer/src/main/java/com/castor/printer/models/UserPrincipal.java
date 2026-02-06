package com.castor.printer.models;

import com.castor.printer.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;


@Entity
@Getter
@Setter
@Table(name = "user_principal")
public class UserPrincipal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(unique = true, nullable = false)
    private String email;

    @Column(nullable = false)
    private String passHash;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Roles role;

    @Column
    private Date createdAt;

    @OneToOne(mappedBy = "userPrincipal",  cascade = CascadeType.ALL, orphanRemoval = true)
    private UserPersonal userPersonal;

}
