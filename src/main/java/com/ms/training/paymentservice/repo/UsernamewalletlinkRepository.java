package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Usernamewalletlink;

public interface UsernamewalletlinkRepository extends JpaRepository<Usernamewalletlink, String> {
}