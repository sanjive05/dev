package com.ecommerce.sbf_ecom.service;

import com.ecommerce.sbf_ecom.model.Category;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
                .findFirst().orElse(null);
        if(category==null){
            return "Id not found!";
        }
        categories.remove(category);
        return "Category with categoryId: "+categoryId+" deleted successfuly... ";
    }
}
