package com.etiya.northwind.Services.Concretes;

import com.etiya.northwind.DTO.OrderDTO;
import com.etiya.northwind.Entities.Concretes.Order;
import com.etiya.northwind.Repository.OrderRepository;
import com.etiya.northwind.Services.Abstracts.IOrderService;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class OrderServiceImp implements IOrderService {

    final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImp(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDTO getOrder(Long orderId) {
        Order order = this.orderRepository.findOrderByOrderId(orderId);
        OrderDTO orderDTO=new OrderDTO();
        orderDTO.setCustomerId(order.getCustomer().getCustomerId());
        orderDTO.setPrice(order.getPrice());
        return orderDTO;
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        List<Order> orders = this.orderRepository.findAll();
        List<OrderDTO> orderDTOs=new ArrayList<>();
        for(int i=0;i<orders.size();i++){
            Order order1=orders.get(i);
            OrderDTO orderDTO1=new OrderDTO();
            orderDTO1.setCustomerId(order1.getCustomer().getCustomerId());
            orderDTO1.setPrice(order1.getPrice());
            orderDTOs.add(orderDTO1);
        }
        return orderDTOs;
    }
}
