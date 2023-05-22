package com.company.delivery.services.impl;

import com.company.delivery.models.entities.Order;
import com.company.delivery.models.enums.Status;
import com.company.delivery.repository.OrderRep;
import com.company.delivery.services.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRep rep;

    @Override
    public Order save(Order order) {
        return rep.save(order);
    }

    @Override
    public Order findById(Long id) {
        return rep.findById(id).orElseThrow(()->new RuntimeException("Order is not found"));
    }

    @Override
    public List<Order> findAll() {
        return rep.findAll();
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public Order delete(Long id) {
        Order order = rep.findById(id).orElseThrow(()->new RuntimeException("Order is not found"));
        order.setStatus(Status.DELETED);
        return save(order);
    }
}
