package com.ms.training.paymentservice.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "usernamewalletlinks")
public class Usernamewalletlink {
    @Id
    @Column(name = "username", nullable = false, length = 50)
    private String username;


    @Column(name = "walletid", nullable = false, length = 50)
    private String walletid;

}