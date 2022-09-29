package com.etiya.northwind.Repository;

import com.etiya.northwind.Entities.Concretes.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

    Order findOrderByOrderId(Long orderId);
}
