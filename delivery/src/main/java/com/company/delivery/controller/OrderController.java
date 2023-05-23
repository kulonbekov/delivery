package com.company.delivery.controller;

import com.company.delivery.models.entities.Order;
import com.company.delivery.services.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Api(tags = "1. Заказы")
@Controller
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping("/orders/new")
    public String getNewOrderPage(Model model) {
        model.addAttribute("order", new Order());
        return "new-order";
    }

    @PostMapping("/orders")
    @ApiOperation("Сохранение")
    String save(@ModelAttribute("order") Order order) {

        service.save(order);
        return "redirect:/orders";
    }


    @GetMapping("/orders")
    @ApiOperation("Вывод всех заказов")
    String findAll(Model model) {
        List<Order> orders = service.findAll();
        model.addAttribute("orders", orders);
        return "orders"; // Это будет отображать шаблон orders.html
    }

}
