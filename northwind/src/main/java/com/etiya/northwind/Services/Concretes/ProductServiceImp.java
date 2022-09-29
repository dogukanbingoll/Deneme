package com.etiya.northwind.Services.Concretes;

import com.etiya.northwind.DTO.ProductDTO;
import com.etiya.northwind.Repository.ProductRepository;
import com.etiya.northwind.Entities.Concretes.Product;
import com.etiya.northwind.Services.Abstracts.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements IProductService {


    final ProductRepository productRepository;

    @Autowired
    public ProductServiceImp(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO getProduct(Long productId) {
        Product product = this.productRepository.getProductByProductId(productId);
        ProductDTO productDTO=new ProductDTO();
        productDTO.setProductId(product.getProductId());
        productDTO.setProductPrice(productDTO.getProductPrice());
        productDTO.setProductName(product.getProductName());
        productDTO.setDetail(product.getDetail());
        productDTO.setCategoryId(product.getCategory().getCategoryId());
        return productDTO;
    }


}
