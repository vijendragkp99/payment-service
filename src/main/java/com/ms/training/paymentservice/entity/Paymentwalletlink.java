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
@Table(name = "paymentwalletlinks")
public class Paymentwalletlink {
    @Id
    @Column(name = "linkid", nullable = false, length = 10)
    private String linkid;

    @Column(name = "paymenttype", length = 10)
    private String paymenttype;

    @Column(name = "paymentrefid", length = 10)
    private String paymentrefid;

    @Column(name = "amount")
    private Integer amount;

    @Column(name = "payerwallet")
    private String payerwallet;

    @Column(name = "payeewallet")
    private String payeewallet;

    @Column(name = "escrowwallet")
    private String escrowwallet;

}