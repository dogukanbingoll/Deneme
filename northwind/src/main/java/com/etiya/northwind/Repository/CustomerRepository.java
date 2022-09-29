package com.etiya.northwind.Repository;

import com.etiya.northwind.Entities.Concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer findCustomerByCustomerId(Long customerId);
}
