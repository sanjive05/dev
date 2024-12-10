package com.ecommerce.sbf_ecom.repositories;

import com.ecommerce.sbf_ecom.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface CategoryRepository extends JpaRepository<Category,Long> {

}