package com.ecommerce.sbf_ecom.controller;

import com.ecommerce.sbf_ecom.model.Category;
import com.ecommerce.sbf_ecom.service.CategoryService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CategoryController {

    CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public ResponseEntity<List<Category>>getAllCategories(){
        return new ResponseEntity<>(categoryService.getAllCategory(),HttpStatus.OK);
    }
    @PostMapping("/api/public/categories")
    public ResponseEntity<String> createCategory(@Valid @RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity<>("Category added successfully...",HttpStatus.CREATED);
    }
    @DeleteMapping("/api/public/categories/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable int id){
        try {
            String status = categoryService.deleteCategory(id);
            return new ResponseEntity<>(status, HttpStatus.OK);
        }
        catch(ResponseStatusException e){
            return new ResponseEntity<>(e.getMessage(),e.getStatusCode());
        }
    }
    @PutMapping("/api/public/categories/{categoryId}")
    public ResponseEntity<String> updateCategory(@RequestBody Category category,@PathVariable int categoryId){
        try{
            Category newCategory = categoryService.updateCategory(category,categoryId);
            return new ResponseEntity<>("Category updated .. Id "+newCategory.getCategoryId(),HttpStatus.OK);
        }
        catch (ResponseStatusException e){
            return new ResponseEntity<>(e.getReason(),e.getStatusCode());
        }
    }
}
