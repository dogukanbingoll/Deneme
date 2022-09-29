package com.etiya.northwind.api.controllers;


import com.etiya.northwind.DTO.OrderDTO;
import com.etiya.northwind.Services.Abstracts.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class OrderController {

    final IOrderService orderService;

    @Autowired
    public OrderController(IOrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/{orderId}")
    public ResponseEntity getOrder(@PathVariable  Long orderId){
        return  ResponseEntity.ok(this.orderService.getOrder(orderId));
    }

    @GetMapping("/getAll")
    public ResponseEntity getAllOrders(){
        return ResponseEntity.ok(this.orderService.getAllOrders());
    }
}
