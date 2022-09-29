package com.etiya.northwind.Services.Abstracts;


import com.etiya.northwind.DTO.OrderDTO;

import java.util.List;

public interface IOrderService {
    OrderDTO getOrder(Long orderId);
    List<OrderDTO> getAllOrders ();

}
