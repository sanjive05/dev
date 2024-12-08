package com.ecommerce.sbf_ecom.service;

import com.ecommerce.sbf_ecom.model.Category;
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



    private List<Category> categories = new ArrayList<>();
    private static int id =1001;
    @Override
    public List<Category> getAllCategory() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryId(id++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(int categoryId) {
        Category category =categories.stream().filter(c -> c.getCategoryId()==categoryId)
                .findFirst().orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Resource not found "));

        categories.remove(category);
        return "Category with categoryId: "+categoryId+" deleted successfuly... ";
    }

    @Override
    public Category updateCategory(Category category,int id) {
        Optional<Category> optionalCategory = categories.stream().filter(c-> c.getCategoryId()==id)
                .findFirst();
        if(optionalCategory.isPresent()){
            Category existingCategory = optionalCategory.get();
            existingCategory.setCategoryName(category.getCategoryName());
            return existingCategory;
        }else {
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,"Category Not found...");
        }
    }


}
