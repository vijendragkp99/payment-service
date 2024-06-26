package com.ms.training.paymentservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.training.paymentservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, String> {
}