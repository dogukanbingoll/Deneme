package com.etiya.northwind.Services.requests.Cart;

import com.etiya.northwind.Entities.Concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCartRequest {

    private Long cartId;
    private Product product;

    private String productName;

    private double productPrice;

    private double totalPrice;
}
