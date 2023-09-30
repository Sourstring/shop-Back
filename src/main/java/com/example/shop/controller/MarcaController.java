package com.example.shop.controller;

import com.example.shop.dtos.MarcaDto;
import com.example.shop.services.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marca")
public class MarcaController {

    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(marcaService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<?> save(@RequestBody MarcaDto marca) {
        return new ResponseEntity<>(marcaService.save(marca), HttpStatus.OK);
    }
}
