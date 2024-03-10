package com.food.order.system.order.service.domain.ports.output.respository;

import com.food.ordering.system.order.service.domain.entity.Order;

import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);

    Optional<Order> findByTrackingId(String trackingId);
}
