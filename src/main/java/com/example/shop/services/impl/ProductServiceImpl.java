package com.example.shop.services.impl;

import com.example.shop.dtos.ProductDto;
import com.example.shop.entities.Product;
import com.example.shop.repositories.CategoryRepo;
import com.example.shop.repositories.ProductRepo;
import com.example.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    public Product save(ProductDto product){
        Product newProduct = Product.builder().marca(product.getMarca()).modelo(product.getModelo()).descripcion(product.getDescripcion())
                .precio(product.getPrecio()).stock(product.getStock()).category(categoryRepo.findByNombre(product.getCategory())).build();
        productRepo.save(newProduct);
        return newProduct;
    }

    public List<Product> findAll(){
        return productRepo.findAll();
    }

    public Product findById(Long id){
        return productRepo.findById(id).orElse(null);
    }

    public Product findByMarca(String marca){
        return productRepo.findByMarca(marca);
    }

    public Product findByModelo(String modelo){
        return productRepo.findByModelo(modelo);
    }
}
