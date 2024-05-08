package com.ms.training.paymentservice.entity;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "wallets")
public class Wallet {
    @Id
    @Column(name = "walletid", nullable = false, length = 10)
    private String walletid;

    @Column(name = "balance")
    private Integer balance;

}