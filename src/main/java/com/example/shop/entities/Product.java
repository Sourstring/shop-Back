package com.example.shop.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@ToString
@Builder
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Marca marca;

    @Column(name = "modelo")
    private String modelo;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "descripcion")
    private String descripcion;

    @ManyToOne
    private Category category;


}
