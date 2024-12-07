package com.ecommerce.sbf_ecom.controller;

import com.ecommerce.sbf_ecom.model.Category;
import com.ecommerce.sbf_ecom.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategories(){
        return categoryService.getAllCategory();
    }
    @PostMapping("/api/public/categories")
    public String createCategory(@RequestBody Category category){
        categoryService.createCategory(category);
        return "Category added successfully...";
    }
    @DeleteMapping("/api/public/categories/{id}")
    public String deleteCategory(@PathVariable int id){
        String status = categoryService.deleteCategory(id);
        return status;
    }
}
