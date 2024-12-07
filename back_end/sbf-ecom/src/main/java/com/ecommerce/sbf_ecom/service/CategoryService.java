package com.ecommerce.sbf_ecom.service;

import com.ecommerce.sbf_ecom.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();
    void createCategory(Category category);
    public String deleteCategory(int categoryId);
}
