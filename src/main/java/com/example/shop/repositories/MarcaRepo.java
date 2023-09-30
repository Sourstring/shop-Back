package com.example.shop.repositories;

import com.example.shop.entities.Marca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaRepo extends JpaRepository<Marca, Long> {

    Marca findByNombre(@Param("nombre") String nombre);
}
