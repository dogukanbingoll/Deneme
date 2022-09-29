package com.etiya.northwind.Services.Concretes;

import com.etiya.northwind.DTO.CustomerDTO;
import com.etiya.northwind.Entities.Concretes.Customer;
import com.etiya.northwind.Repository.CustomerRepository;
import com.etiya.northwind.Services.Abstracts.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusotmerServiceImp implements ICustomerService {

    final CustomerRepository customerRepository;

    @Autowired
    public CusotmerServiceImp(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDTO getCustomer(Long custId) {
        CustomerDTO customerDTO=new CustomerDTO();
        Customer customer= this.customerRepository.findCustomerByCustomerId(custId);
        customerDTO.setCustomerId(customer.getCustomerId());
        customerDTO.setFirstName(customer.getFirstName());
        customerDTO.setLastName(customer.getLastName());
        customerDTO.setEmail(customer.getEmail());
        customerDTO.setPassword(customer.getPasswor());
        return customerDTO;
    }
}
