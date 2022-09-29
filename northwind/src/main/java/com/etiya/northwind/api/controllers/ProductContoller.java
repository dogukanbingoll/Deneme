package com.etiya.northwind.api.controllers;

import com.etiya.northwind.Services.Abstracts.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class ProductContoller {

    final IProductService productService;

    @Autowired
    public ProductContoller(IProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{productId}")
    public ResponseEntity getProduct(Long productId){
        return  ResponseEntity.ok(this.productService.getProduct(productId));
    }
}
