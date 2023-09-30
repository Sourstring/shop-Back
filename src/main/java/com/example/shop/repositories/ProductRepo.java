package com.example.shop.repositories;

import com.example.shop.entities.Marca;
import com.example.shop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {

        Product findByMarca(Marca marca);

        Product findByModelo(String modelo);
}
