package com.example.shop.controller;

import com.example.shop.dtos.CategoryDto;
import com.example.shop.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<?> getAllCategories() {
        return new ResponseEntity<>(categoryService.findAll(), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/{nombre}")
    public ResponseEntity<?> getCategoryByName(@PathVariable String nombre) {
        return new ResponseEntity<>(categoryService.findByNombre(nombre), HttpStatus.OK);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    public ResponseEntity<?> createCategory(@RequestBody CategoryDto category) {
        return new ResponseEntity<>(categoryService.save(category.getNombre()), HttpStatus.CREATED);
    }
}
