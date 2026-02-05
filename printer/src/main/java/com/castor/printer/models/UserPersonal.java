package com.castor.printer.models;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user_personal")
public class UserPersonal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @MapsId
    @OneToOne
    @JoinColumn(name = "user_id")
    private UserPrincipal userPrincipal;

    @Column(nullable = false)
    String name;

    @Column(nullable = false)
    String address;

    @Column(nullable = false)
    String gender;

    @Column(nullable = false)
    String phone;

    @Column(nullable = false)
    String yo;


}
