package com.example.shop.controller;

import com.example.shop.dtos.ProductDto;
import com.example.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/create")
    public ResponseEntity<?> createProduct(@RequestBody ProductDto product){
        return new ResponseEntity<>(productService.save(product), HttpStatus.CREATED);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/all")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
    }
}
