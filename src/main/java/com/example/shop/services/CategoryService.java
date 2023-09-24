package com.example.shop.services;

import com.example.shop.entities.Category;

import java.util.List;

public interface CategoryService {
    Category save(String category);

    List<Category> findAll();

    Category findById(Long id);

    Category findByNombre(String nombre);
}
