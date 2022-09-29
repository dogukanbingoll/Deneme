package com.etiya.northwind.Services.Abstracts;

import com.etiya.northwind.DTO.CustomerDTO;
import com.etiya.northwind.Repository.CustomerRepository;


public interface ICustomerService   {
 CustomerDTO getCustomer(Long customerId);
}