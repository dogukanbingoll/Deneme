package com.etiya.northwind.Services.Concretes;

import com.etiya.northwind.DTO.CategoryDTO;
import com.etiya.northwind.Services.Abstracts.ICategoryService;
import com.etiya.northwind.Repository.CategoryRepository;
import com.etiya.northwind.Entities.Concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements ICategoryService {


    final CategoryRepository categoryRepository;


    @Autowired
    public CategoryServiceImp(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public CategoryDTO getCategory(Long categoryId) {
        Category category = this.categoryRepository.findCategoryByCategoryId(categoryId);
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCategoryId(category.getCategoryId());
        categoryDTO.setCategoryName(category.getCategoryName());
        return categoryDTO;
    }
}
