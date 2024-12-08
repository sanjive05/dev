package com.ecommerce.sbf_ecom.controller;

import com.ecommerce.sbf_ecom.model.Category;
import com.ecommerce.sbf_ecom.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> deleteCategory(@PathVariable int id){
        String status = categoryService.deleteCategory(id);
        if(status==null){
            return new ResponseEntity<>("No data found", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(status,HttpStatus.OK);
    }
}
