package com.etiya.northwind.Services.requests.Cart;

import com.etiya.northwind.Entities.Concretes.Product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCartRequest {



    private Long product;

    private String productName;

    private double productPrice;

    private double totalPrice;

}
