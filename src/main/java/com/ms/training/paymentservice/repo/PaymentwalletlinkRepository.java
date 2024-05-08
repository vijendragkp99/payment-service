package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Paymentwalletlink;

public interface PaymentwalletlinkRepository extends JpaRepository<Paymentwalletlink, String> {
}