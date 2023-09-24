package com.example.shop.repositories;

import com.example.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

        Product findByMarca(String marca);

        Product findByModelo(String modelo);
}
