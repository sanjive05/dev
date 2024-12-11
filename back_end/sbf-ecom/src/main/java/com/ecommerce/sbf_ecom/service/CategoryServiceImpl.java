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



    private static int id =1001;
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
        List<Category> categories = categoryRepository.findAll();
        categoryRepository.deleteById((long)categoryId);
        Category category =categories.stream().filter(c -> c.getCategoryId()==categoryId)
                .findFirst().orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found "));
       categoryRepository.delete(category);
        return "Category with categoryId: "+categoryId+" deleted successfuly... ";
    }

    @Override
    public Category updateCategory(Category category,int id) {
        List<Category> categories = categoryRepository.findAll();
        Optional<Category> optionalCategory = categories.stream().filter(c-> c.getCategoryId()==id)
                .findFirst();
        if(optionalCategory.isPresent()){
            Category existingCategory = optionalCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            categoryRepository.save(existingCategory);
            return existingCategory;
        }else {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Category Not found...");
        }
    }


}
