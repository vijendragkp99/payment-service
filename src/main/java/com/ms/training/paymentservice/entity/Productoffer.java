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
@Table(name = "productoffers")
public class Productoffer {
    @Id
    @Column(name = "id", nullable = false, length = 10)
    private String id;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "sellername")
    private String sellername;

    @Column(name = "unitprice")
    private Integer unitprice;

    @Column(name = "offername", length = 50)
    private String offername;

    @Column(name = "currency", length = 10)
    private String currency;

}