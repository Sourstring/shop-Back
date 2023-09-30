package com.example.shop.services.impl;

import com.example.shop.dtos.MarcaDto;
import com.example.shop.entities.Marca;
import com.example.shop.repositories.MarcaRepo;
import com.example.shop.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaServiceImpl implements MarcaService {

    @Autowired
    private MarcaRepo marcaRepo;

    @Override
    public List<Marca> findAll() {
        return marcaRepo.findAll();
    }

    @Override
    public Marca findById(Long id) {
        return marcaRepo.findById(id).orElse(null);
    }

    @Override
    public Marca save(MarcaDto marcaDto) {
        return marcaRepo.save(Marca.builder().nombre(marcaDto.getNombre()).build());
    }

    @Override
    public Marca findByNombre(String nombre) {
        return marcaRepo.getByNombre(nombre);
    }

    @Override
    public void deleteById(Long id) {
        marcaRepo.deleteById(id);
    }
}
