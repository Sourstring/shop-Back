package com.example.shop.services;

import com.example.shop.dtos.MarcaDto;
import com.example.shop.entities.Marca;

import java.util.List;

public interface MarcaService {

    List<Marca> findAll();

    Marca findById(Long id);

    Marca save(MarcaDto marcaDto);

    Marca findByNombre(String nombre);

    void deleteById(Long id);
}
