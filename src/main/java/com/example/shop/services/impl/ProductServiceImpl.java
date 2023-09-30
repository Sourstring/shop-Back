package com.example.shop.services.impl;

import com.example.shop.dtos.ProductDto;
import com.example.shop.entities.Marca;
import com.example.shop.entities.Product;
import com.example.shop.repositories.ProductRepo;
import com.example.shop.services.CategoryService;
import com.example.shop.services.MarcaService;
import com.example.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private MarcaService marcaService;

    public Product save(ProductDto product){
        Product newProduct = Product.builder().marca(marcaService.findByNombre(product.getMarca())).modelo(product.getModelo()).descripcion(product.getDescripcion())
                .precio(product.getPrecio()).stock(product.getStock()).category(categoryService.findByNombre(product.getCategory())).build();
        productRepo.save(newProduct);
        return newProduct;
    }

    public List<Product> findAll(){
        return productRepo.findAll();
    }

    public Product findById(Long id){
        return productRepo.findById(id).orElse(null);
    }

    public Product findByMarca(String marca1) {
        Marca marca = marcaService.findByNombre(marca1);
        return productRepo.findByMarca(marca);
    }

    public Product findByModelo(String modelo){
        return productRepo.findByModelo(modelo);
    }
}
