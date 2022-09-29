package com.etiya.northwind.api.controllers;


import com.etiya.northwind.Services.Abstracts.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {


    final ICustomerService customerService;

    @Autowired
    public CustomerController(ICustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    ResponseEntity inquireCustomer(@PathVariable  Long customer){
       return ResponseEntity.ok(this.customerService.getCustomer(customer));

    }
}
