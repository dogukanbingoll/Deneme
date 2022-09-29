package com.etiya.northwind.Services.Abstracts;

import com.etiya.northwind.DTO.ProductDTO;
public interface IProductService {
    ProductDTO getProduct(Long productId);

}
