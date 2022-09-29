package com.etiya.northwind.Repository;

import com.etiya.northwind.Entities.Concretes.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {
    Category findCategoryByCategoryId(Long categoryId);
}
