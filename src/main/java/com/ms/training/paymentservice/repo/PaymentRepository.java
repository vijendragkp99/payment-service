package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String> {
}