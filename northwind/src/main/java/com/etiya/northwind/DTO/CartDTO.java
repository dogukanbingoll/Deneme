package com.etiya.northwind.DTO;

import com.etiya.northwind.Entities.Concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDTO {
    private Long cartId;
    private Product product;

    private String productName;

    private double productPrice;

    private double totalPrice;
}
