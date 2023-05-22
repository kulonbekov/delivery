package com.company.delivery.services;

import com.company.delivery.models.entities.Order;

import java.util.List;

public interface OrderService {

    Order save (Order order);
    Order findById(Long id);
    List<Order> findAll();
    Order update(Order order);
    Order delete(Long id);
}
