package com.etiya.northwind.Services.Abstracts;

import com.etiya.northwind.DTO.CategoryDTO;

public interface ICategoryService {

   CategoryDTO getCategory(Long categoryId);
}
