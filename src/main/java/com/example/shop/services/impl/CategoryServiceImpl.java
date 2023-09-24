package com.example.shop.services.impl;

import com.example.shop.entities.Category;
import com.example.shop.repositories.CategoryRepo;
import com.example.shop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category save(String category) {
        categoryRepo.save(Category.builder().nombre(category).build());
        return Category.builder().nombre(category).build();
    }

    @Override
    public List<Category> findAll() {
        return categoryRepo.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryRepo.findById(id).orElse(null);
    }

    @Override
    public Category findByNombre(String nombre) {
        return categoryRepo.findByNombre(nombre);
    }
}
