package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Productoffer;

public interface ProductofferRepository extends JpaRepository<Productoffer, String> {
}