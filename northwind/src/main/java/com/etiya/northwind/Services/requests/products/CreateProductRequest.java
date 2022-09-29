package com.etiya.northwind.Services.requests.products;

import com.etiya.northwind.Entities.Concretes.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {


    private String productName;

    private double productPrice;

    private String detail;

    private Long categoryId;

}
