package com.etiya.northwind.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private int productId;

    private String productName;

    private double productPrice;

    private String detail;

    private Long categoryId;
}
