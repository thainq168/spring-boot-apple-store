package com.thaidev.CloneAppleStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thaidev.CloneAppleStore.model.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
