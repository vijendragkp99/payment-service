package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, String> {
}