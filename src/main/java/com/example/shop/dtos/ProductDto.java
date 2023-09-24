package com.example.shop.dtos;

import lombok.Data;

@Data
public class ProductDto {

    private String marca;

    private String modelo;

    private Double precio;

    private Integer stock;

    private String descripcion;

    private String category;
}
