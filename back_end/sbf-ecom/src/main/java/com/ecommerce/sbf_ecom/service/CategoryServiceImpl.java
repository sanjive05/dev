package com.ecommerce.sbf_ecom.service;

import com.ecommerce.sbf_ecom.model.Category;
import com.ecommerce.sbf_ecom.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    CategoryRepository categoryRepository;



    private static long id =1001;
    @Override
    public List<Category> getAllCategory() {

        return  categoryRepository.findAll();
    }

    @Override
    public void createCategory(Category category) {
        System.out.println(category.toString());
        categoryRepository.save(category);
        
    }

    @Override
    public String deleteCategory(int categoryId) {
        Category category = categoryRepository.findById((long)categoryId)
                        .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found"));

        return "Category with categoryId: "+categoryId+" deleted successfuly... ";
    }

    @Override
    public Category updateCategory(Category category,int id) {
        Category c = categoryRepository.findById((long)id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found"));

            c.setCategoryName(category.getCategoryName());
            categoryRepository.save(c);
            return c;
    }


}
