package com.example.shop.services;

import com.example.shop.dtos.ProductDto;
import com.example.shop.entities.Product;

import java.util.List;

public interface ProductService {

    Product save(ProductDto product);

    List<Product> findAll();

    Product findById(Long id);

    Product findByMarca(String marca);

    Product findByModelo(String modelo);

}
